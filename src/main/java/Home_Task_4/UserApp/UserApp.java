package Home_Task_4.UserApp;

import Home_Task_4.DataBases.TicketDataBase;
import Home_Task_4.DataBases.UserDateBases;
import Home_Task_4.ServerApp.Customer;
import Home_Task_4.ServerApp.Ticket;
import Home_Task_4.ServerApp.User;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static Home_Task_4.UserApp.Input.*;

public class UserApp {
    public static void main(String[] args) {
        boolean flag = true;
        boolean flagCase_1 = true;
        UserDateBases userDateBases = new UserDateBases();
        List<Ticket> tmpList = new ArrayList<>();
        while (flag){
            System.out.println("Choose option:" +
                                "\n1. Log in" +
                                "\n2. Register" +
                                "\n3. Exit");
            String input = inputString("\nEnter Option");
            switch (input) {
                case "1":
                    String inputLogin = inputString("Enter your Name");
                    int inputPass = inputInteger("Enter your password");
                    User user = userDateBases.login(inputLogin, inputPass);
                    if (user == null){
                        System.out.println("Wrong name or password. Try again");
                        break;
                    }else {
                        Customer customer = new Customer(user);
                        System.out.println("You are logged in" + "\nHello Dear " + customer.getUser().getName() +
                                            " " + customer.getUser().getSurname());
                        System.out.println();
                        while (flagCase_1){

                            System.out.println("Choose option" +
                                                "\n1. Show all Available Tickets" +
                                                "\n2. Buy Ticket" +
                                                "\n3. Log out");
                            String inputCase_1 = inputString("Enter option");
                            switch (inputCase_1){
                                case "1":
                                    customer.showAvailbleTickets();
                                    System.out.println();
                                    break;
                                case "2":
                                    long routeNumber = inputLong("Select route");
                                    int place = inputInteger("Select Place");
                                    LocalDateTime localDateTime = inputLocalDateTime();
                                    customer.byuTicket(routeNumber, place, localDateTime);
                                    System.out.println();
                                    break;
                                case "3":

                                    flagCase_1 = false;
                            }
                        }
                    }
                    flagCase_1 = true;
                    break;
                case "2":
                    String inputName = inputString("Enter your Name");
                    String inputSurname = inputString("Enter your Surname");
                    long inputCardNum = inputLong("Enter your Card Number");
                    int inputPassword = inputInteger("Enter your Password");
                    User newUser = new User(inputName, inputSurname, inputCardNum,inputPassword);
                    userDateBases.addUser(newUser);
                    break;
                case "3":
                    flag = false;
            }
        }
    }
}
