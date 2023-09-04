package Home_Task_4.UserApp;

import Home_Task_4.DataBases.UserDateBases;
import Home_Task_4.ServerApp.User;

import java.util.List;

import static Home_Task_4.UserApp.Input.inputString;

public class Main {
    public static void main(String[] args) {
        UserDateBases userDateBases = new UserDateBases();
        String input = inputString("Enter String");
        System.out.println(userDateBases.login(input, 1234));
        System.out.println(input);

    }
}
