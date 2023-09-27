package Home_Task_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TestUat {
    private String commonPath = System.getProperty("user.dir");
    private String separator = System.getProperty("file.separator");
    private String finalPath = commonPath + separator + "src" + separator + "main" + separator + "java" + separator + "Home_Task_12"
            + separator + "UATtest.txt";
    /**
     * Метод возвращает путь по умолчанию.
     */
    public String getPath(){
        return finalPath;
    }

    /** Метод присваевает полный путь к файлу UATtest.txt в случае если путь по умолчанию указан не верно
     *
     */
    private void setFinalPath() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите полный путь до файла UATtest.txt согласно вашей Операционной Системе");
        String finalPath = input.next();
        this.finalPath = finalPath;
    }

    public void printAnswers() {
        if (Files.exists(Path.of(this.finalPath))) {
            try (BufferedReader br = new BufferedReader(new FileReader(this.finalPath))) {
                String line = br.readLine();
                int numberOfCase = 1;
                while (line != null) {
                    int numOfColumn = 1;
                    System.out.println("| " + numberOfCase + "." + numOfColumn +" User Case".toUpperCase());
                    System.out.print("| ");
                    DelayPrint.delayPrint(line);
                    numOfColumn++;

                    System.out.println("\n| " + numberOfCase + "." + numOfColumn + " Действие".toUpperCase());
                    line = br.readLine();
                    System.out.print("| ");
                    DelayPrint.delayPrint(line);
                    numOfColumn++;

                    System.out.println("\n| "+ numberOfCase + "." + numOfColumn + " Ожидаемый результат".toUpperCase());
                    line = br.readLine();
                    System.out.print("| ");
                    DelayPrint.delayPrint(line);
                    System.out.println("\n|" + "=".repeat(150));
                    numberOfCase++;

                    line = br.readLine();
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Error");
            }
        }else{
            setFinalPath();
            printAnswers();
        }
    }
}
