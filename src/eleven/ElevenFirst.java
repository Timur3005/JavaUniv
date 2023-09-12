package eleven;

import java.util.Date;

public class ElevenFirst {
    public static void main(String[] args) {
        // Получение текущей даты и времени
        Date currentDate = new Date(System.currentTimeMillis());

        // Фамилия разработчика
        String developerLastName = "Фамилия Разработчика";

        // Дата и время получения задания

        // Дата и время сдачи задания
        Date taskSubmissionDate = new Date(System.currentTimeMillis()+187251845L); // Здесь можно установить конкретную дату и время

        // Вывод информации
        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + currentDate);
        System.out.println("Дата и время сдачи задания: " + taskSubmissionDate);
    }
}
