package Home_Task_4.UserApp;

import Home_Task_4.DataBases.UserDateBases;
import Home_Task_4.ServerApp.User;

import java.util.List;

import static Home_Task_4.UserApp.Input.inputInteger;
import static Home_Task_4.UserApp.Input.inputString;

public class Main {
    public static void main(String[] args) {

        String str = inputString("Eneter");
        str = str.replace(".", "");

        System.out.println(str.replace(' ', '_'));
    }
}
