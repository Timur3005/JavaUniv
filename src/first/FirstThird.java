package first;

import java.util.Scanner;

public class FirstThird {

    private final Scanner scanner;

    public FirstThird(Scanner scanner) {
        this.scanner = scanner;
    }

    protected void first(){

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
}
