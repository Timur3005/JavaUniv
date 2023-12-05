package practice13;

import java.io.*;

public class FileOperations {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        // Задание 1: Реализовать запись в файл введённой с клавиатуры информации
        writeToTextFile();

        // Задание 2: Реализовать вывод информации из файла на экран
        readFromTextFile();

        // Задание 3: Заменить информацию в файле на информацию, введённую с клавиатуры
        overwriteFileContent();

        // Задание 4: Добавить в конец исходного файла текст, введённый с клавиатуры
        appendToFile();
    }

    private static void writeToTextFile() {
        try (FileWriter writer = new FileWriter("C:\\Users\\TimurMakhmutov\\Desktop\\javatest.txt", false);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            System.out.println("Введите текст для записи в файл:");
            String text = br.readLine();

            bufferedWriter.write(text);
            bufferedWriter.newLine();  // Добавляем новую строку
            bufferedWriter.flush();

            System.out.println("Текст успешно записан в файл.");

        } catch (IOException ex) {
            System.out.println("Ошибка при записи в файл: " + ex.getMessage());
        }
    }

    private static void readFromTextFile() {
        try (FileReader reader = new FileReader("C:\\Users\\TimurMakhmutov\\Desktop\\javatest.txt")) {
            System.out.println("Содержимое файла:");

            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException ex) {
            System.out.println("Ошибка при чтении файла: " + ex.getMessage());
        }
    }

    private static void overwriteFileContent() {
        try (FileWriter writer = new FileWriter("C:\\Users\\TimurMakhmutov\\Desktop\\javatest.txt", false);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            System.out.println("Введите новый текст для записи в файл:");
            String newText = br.readLine();

            bufferedWriter.write(newText);
            bufferedWriter.newLine();  // Добавляем новую строку
            bufferedWriter.flush();

            System.out.println("Содержимое файла успешно заменено.");

        } catch (IOException ex) {
            System.out.println("Ошибка при записи в файл: " + ex.getMessage());
        }
    }

    private static void appendToFile() {
        try (FileWriter writer = new FileWriter("C:\\Users\\TimurMakhmutov\\Desktop\\javatest.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            System.out.println("Введите текст для добавления в конец файла:");
            String text = br.readLine();

            bufferedWriter.newLine();  // Переход на новую строку перед добавлением текста
            bufferedWriter.write(text);
            bufferedWriter.newLine();  // Добавляем новую строку
            bufferedWriter.flush();

            System.out.println("Текст успешно добавлен в конец файла.");

        } catch (IOException ex) {
            System.out.println("Ошибка при записи в файл: " + ex.getMessage());
        }
    }
}


