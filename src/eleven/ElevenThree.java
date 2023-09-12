package eleven;

import tenth.StudentTenth;

import java.util.Scanner;

public class ElevenThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя");
        String firstName = scanner.nextLine();

        System.out.println("Введите фамилию");
        String surname = scanner.nextLine();

        System.out.println("Введите специальность");
        String spec = scanner.nextLine();

        System.out.println("Введите курс");
        int course = scanner.nextInt();
        scanner.nextLine(); // Считываем символ новой строки

        System.out.println("Введите группу");
        String group = scanner.nextLine();

        System.out.println("Введите средний балл");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); // Считываем символ новой строки

        StudentTenth studentTenth = new StudentTenth(firstName, surname, spec, course, group, gpa);

        System.out.println("Введите формат даты");
        String format = scanner.nextLine();
        studentTenth.setDateFormat(format);

        System.out.println("Введите дату в указанном формате");
        String date = scanner.nextLine();
        studentTenth.setBirthDay(date);

        System.out.println(studentTenth);
    }

}
