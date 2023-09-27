package Home_Task_12;

public class DelayPrint {
    public static void delayPrint(String text){
        try {
            int size = text.length();
            for (int i = 0; i < size; i++) {
                System.out.print(text.charAt(i));
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    System.out.println("Interrupted");
                }
            }
        }catch(NullPointerException e){
            System.out.println("Error: Line is null");
        }

    }
}
