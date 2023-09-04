package Home_Task_4.UserApp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {
    public static String inputString(String msg){
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        String text = input.next();
        return text;
    }
    public static int inputInteger(String msg){
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        int integer = input.nextInt();
        return integer;
    }
    public static long inputLong(String msg){
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        long longg = input.nextLong();
        return longg;
    }
}
