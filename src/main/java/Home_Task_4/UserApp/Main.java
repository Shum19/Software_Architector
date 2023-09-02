package Home_Task_4.UserApp;

public class Main {
    public static void main(String[] args) {
        long test = 1111_1111_1111_1111L;
        String str = Long.toString(test);
        str = str.substring(12, 16);
        System.out.println(str.length() +" "+ str);
    }
}
