import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    private static void first(){
        Scanner sc = new Scanner(System.in);

        System.out.println("введите размер массива");
        int length = sc.nextInt();

        int[] mas = new int[length];

        int sum = 0;

        for (int i=0; i<length; i++){
            System.out.println("введите элемент массива");
            int x = sc.nextInt();
            mas[i] = x;
            sum += x;
        }

        System.out.println("сумма элементов массива"+sum+" среднее арифметическое "+ (double) sum /length);
    }


}