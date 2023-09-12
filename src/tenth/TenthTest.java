package tenth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TenthTest {

    public static void main(String[] args) {
        List<StudentTenth> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 1 для сортировки по рейтингуб 2 - по курсу");
        int x = scanner.nextInt();
        Comparator<StudentTenth> comparator = (o1, o2) -> {
            if (x == 1) return compareForGpa(o1, o2);
            else return compareForCourse(o1, o2);
        };
        students.add(new StudentTenth("Иван", "Иванов", "Информатика", 3, "Группа 1", 4.5));
        students.add(new StudentTenth("Петр", "Петров", "Физика", 2, "Группа 2", 3.7));
        students.add(new StudentTenth("Мария", "Сидорова", "Химия", 4, "Группа 3", 4.8));

        SortingStudentsByGPATenth sorter = new SortingStudentsByGPATenth(students, comparator);
        sorter.setArray(students);

        // Сортировка слиянием по среднему баллу (по убыванию)
        sorter.mergeSort();

        // Вывод отсортированного списка
        sorter.outArray();
    }

    private static int compareForGpa(StudentTenth s1, StudentTenth s2){
        return Double.compare(s1.getGpa(), s2.getGpa());
    }

    private static int compareForCourse(StudentTenth s1, StudentTenth s2){
        return Integer.compare(s2.getCourse(), s1.getCourse());
    }


}
