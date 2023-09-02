package Home_Task_4.UserApp;

import java.util.Scanner;

import static Home_Task_4.UserApp.Input.inputInteger;
import static Home_Task_4.UserApp.Input.inputString;

public class UserApp {
    public static void main(String[] args) {
        boolean flag = true;
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

                case "2":
                    String inputName = inputString("Enter your Name");
                    String inputSurname = inputString("Enter your Surname");
                    String inputCardNum = inputString("Enter your Card Number");
                    String inputPassword = inputString("Enter your Password");
            }
        }
    }
}
