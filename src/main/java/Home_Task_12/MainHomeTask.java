package Home_Task_12;

public class MainHomeTask {
    public static void main(String[] args) {
        boolean flag = true;
        DelayPrint.delayPrint("Домашнее задание к семинару 12. ДЗ написано в IntelliJ IDEA в системе macOS.\nПуть до текстовых файлов " +
                            "указан в соответсвии системы macOS\nВ приложение предусмотрен ввод пути до файла через консоль.\n");
        while (flag){
            System.out.println( "Выберите тест который хотите проверить"+
                                "\n1. Тест END TO END" +
                                "\n2. Тест UAT по сценарию User Case" +
                                "\n3. Выход");
            int input = Input.inputInteger("Введите номер от 1 - 3");
            if (input > 3 || input < 1){
                System.out.println("К сожалению нет такого номера. Попробуйте еще раз.");
            }
            switch (input){
                case 1:
                    ApiEndToEnd endToEndTest = new ApiEndToEnd();
                    endToEndTest.printTable();
                    break;
                case 2:
                    TestUat uatTest = new TestUat();
                    uatTest.printAnswers();
                    break;
                case 3:
                    flag = false;
            }
        }
    }
}
