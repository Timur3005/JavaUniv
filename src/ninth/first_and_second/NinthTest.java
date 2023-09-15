package ninth.first_and_second;

import java.util.Arrays;
import java.util.Random;

public class NinthTest {

    public static void insertionSort(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        //9.1
        Random random = new Random();
        Student[] students = new Student[4];
        for (int i = 0; i<4;i++){
            students[i] = new Student(random.nextInt(), Integer.toString(i), Integer.toString(i), random.nextInt(1,10));
        }
        insertionSort(students);
        for (int i=0;i<4;i++){
            System.out.println(students[i]);
        }

        //9.2
        Arrays.sort(students, new SortingStudentsByGPA());

        for (int i=0;i<4;i++){
            System.out.println(students[i]);
        }
    }


}
