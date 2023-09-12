package eleven;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ElevenTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получение текущей даты и времени
        Date currentDate = new Date();
        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.setTime(currentDate);

        // Ввод даты от пользователя
        System.out.print("Введите дату в формате (dd/MM/yyyy HH:mm): ");
        String userInput = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date userDate;

        try {
            userDate = dateFormat.parse(userInput);

            // Сравнение дат
            if (userDate.after(currentDate)) {
                System.out.println("Введенная дата позже текущей даты и времени.");
            } else if (userDate.before(currentDate)) {
                System.out.println("Введенная дата раньше текущей даты и времени.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой и временем.");
            }
        } catch (ParseException e) {
            System.err.println("Ошибка при парсинге даты. Убедитесь, что вы ввели дату в правильном формате.");
        }

    }
}
