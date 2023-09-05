package Home_Task_4.UserApp;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static String inputString(String msg){
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        String text = input.nextLine();
        return text;
    }
    public static int inputInteger(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        if (input.hasNextInt()){
            int integer = input.nextInt();
            return integer;
        }else {
            System.out.println("Wrong format");
            int integer_2 = inputInteger(msg);
            return integer_2;
        }
    }
    public static long inputLong(String msg){
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        long longg = input.nextLong();
        return longg;
    }
    public static LocalDateTime inputLocalDateTime(){
        int year = inputInteger("Enter year");
        int month = inputInteger("Enter month");
        int day = inputInteger("Enter day");
        int hh = inputInteger("Enter hours");
        int min = inputInteger("Enter minutes");
        LocalDateTime localDateTime = LocalDateTime.of(year, month, day, hh, min);
        return localDateTime;
    }
    public static double inputDouble(String msg){
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        double doublle = input.nextDouble();
        return doublle;
    }

}
