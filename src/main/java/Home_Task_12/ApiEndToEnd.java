package Home_Task_12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ApiEndToEnd {
    private String commonPath = System.getProperty("user.dir");
    private String separator = System.getProperty("file.separator");
    private String finalPath = commonPath + separator + "src" + separator + "main" + separator + "java" + separator + "Home_Task_12"
                        + separator + "API_E2E.txt";
    /**
     * Метод возвращает путь по умолчанию.
     */
    public String getPath(){
        return finalPath;
    }

    /** Метод присваевает полный путь к файлу API_E2E.txt в случае если путь по умолчанию указан не верно
     *
     */
    private void setFinalPath() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите полный путь до файла API_E2E.txt согласно вашей Операционной Системе");
        String finalPath = input.next();
        this.finalPath = finalPath;
    }

    /**
     * Выводит таблицу с методами и ожидаемым результатом по поведению метода
     * Значениия по умолчанию 16, 97, 116 установлены согласно максимальному колиичеству символов
     * для равнового вывода вертиикалного символа
     */
    public void printTable(){
        if (Files.exists(Path.of(this.finalPath))){
            try (BufferedReader br = new BufferedReader(new FileReader(this.finalPath))){
                String line = br.readLine();
                while (line != null){
                    System.out.print("| "+ line);
                    int space = 16 - line.length();
                    line = br.readLine();
                    int spaceEnd = 97 - line.length();
                    System.out.println(" ".repeat(space) + "| " + line + " ".repeat(spaceEnd) + "|");
                    System.out.println("|" + "-".repeat(116) + "|");
                    line = br.readLine();
                }
                br.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            setFinalPath();
            printTable();
        }
    }



}
