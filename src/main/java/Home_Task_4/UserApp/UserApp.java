package Home_Task_4.UserApp;

import Home_Task_4.DataBases.UserDateBases;
import Home_Task_4.ServerApp.Customer;
import Home_Task_4.ServerApp.User;

import java.util.Scanner;

import static Home_Task_4.UserApp.Input.*;

public class UserApp {
    public static void main(String[] args) {
        boolean flag = true;
        UserDateBases userDateBases = new UserDateBases();
        while (flag){
            System.out.println("Choose option:" +
                                "\n1. Log in" +
                                "\n2. Register" +
                                "\n3. Exit");
            String input = inputString("\nEnter Option");
            switch (input){
                case "1":
                    String inputLogin = inputString("Enter your Name");
                    // Оределить exeption InputMismatchException
                    int inputPass = inputInteger("Enter your password");
                    User user = userDateBases.login(inputLogin, inputPass);
                    if (user == null){
                        System.out.println("Wrong name or password. Try again");
                        break;
                    }
                    System.out.println("You are logged in");
                    Customer customer = new Customer(user);
                    break;
                case "2":
                    String inputName = inputString("Enter your Name");
                    String inputSurname = inputString("Enter your Surname");
                    long inputCardNum = inputLong("Enter your Card Number");
                    int inputPassword = inputInteger("Enter your Password");
                    User newUser = new User(inputName, inputSurname, inputCardNum,inputPassword);
                    userDateBases.addUser(newUser);
                    userDateBases.print();
                    break;
                case "3":
                    flag = false;
            }
        }
    }
}
