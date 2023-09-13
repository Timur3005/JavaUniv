package first;

import java.util.Arrays;
import java.util.Scanner;

public class First {

    private final Scanner scanner;

    public First(Scanner scanner) {
        this.scanner = scanner;
    }

    protected void third(){

        System.out.println("введите размер массива");
        int length = scanner.nextInt();

        int[] mas = new int[length];

        int sum = 0;

        for (int i=0; i<length; i++){
            System.out.println("введите элемент массива");
            int x = scanner.nextInt();
            mas[i] = x;
            sum += x;
        }

        System.out.println("сумма элементов массива "+sum+" среднее арифметическое "+ (double) sum /length);
    }

    protected void fourth(){

        System.out.println("введите размер массива");
        int length = scanner.nextInt();
        int[] mas = new int[length];

        for (int i=0; i<length; i++){
            System.out.println("введите элемент массива");
            int x = scanner.nextInt();
            mas[i] = x;
        }

        int sum = 0;

        while ( length>0){
            length--;
            sum+=mas[length];
        }

        System.out.println("сумма элементов массива = " + sum);
        System.out.println("max = " + Arrays.stream(mas).max());
        System.out.println("min = " + Arrays.stream(mas).min());
    }
}
