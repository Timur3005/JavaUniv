import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        first();
        third();
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

    private static void third(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите количество элементов в массиве");
        int n = sc.nextInt();
        double[] random_mas = new double[n];
        for (int i=0; i<n; i++){
            random_mas[i]=Math.random();
        }

        System.out.println("получившийся массив");
        System.out.println(Arrays.toString(random_mas));

        System.out.println("отсортированный массив");
        Arrays.sort(random_mas);
        System.out.println(Arrays.toString(random_mas));
    }
}