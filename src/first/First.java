package first;

import java.util.Arrays;
import java.util.Scanner;

public class First {

    private final Scanner scanner;

    public First(Scanner scanner) {
        this.scanner = scanner;
    }

    protected void third(){

        int length;
        int[] mas;

        System.out.println("введите размер массива");

        while (true){
            try {
                length = scanner.nextInt();
                mas = new int[length];
                break;
            }
            catch (Exception e) {
                System.out.println("введите размер массива заново");
                scanner.nextLine();
            }

        }
        int sum = 0;

        for (int i=0; i<length; i++){
            System.out.println("введите элемент массива - натуральное число");
            int x = scanner.nextInt();
            mas[i] = x;
            sum += x;
        }

        System.out.println("сумма элементов массива "+sum+" среднее арифметическое "+ (double) sum /length);
    }

    protected void fourth(){

        int length;
        int[] mas;

        System.out.println("введите размер массива");

        while (true){
            try {
                length = scanner.nextInt();
                mas = new int[length];
                break;
            }
            catch (Exception e) {
                System.out.println("введите размер массива заново");
                scanner.nextLine();
            }
        }

        for (int i=0; i<length; i++){
            System.out.println("введите элемент массива - натуральное число");
            int x = scanner.nextInt();
            mas[i] = x;
        }

        int sum = 0;

        while (length>0){
            length--;
            sum+=mas[length];
        }

        System.out.println("сумма элементов массива = " + sum);
        System.out.println("max = " + Arrays.stream(mas).max());
        System.out.println("min = " + Arrays.stream(mas).min());
    }

    protected void fifth(String[] args){
        if (args.length == 0) {
            System.out.println("Нет аргументов командной строки.");
        }
        else {
            System.out.println("Аргументы командной строки:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
