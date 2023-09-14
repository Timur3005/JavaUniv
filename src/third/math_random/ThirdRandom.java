package third.math_random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThirdRandom {

    private final Scanner sc;

    public ThirdRandom(Scanner sc) {
        this.sc = sc;
    }

    protected void first(){
        System.out.println("введите количество элементов в массиве");
        double[] random_mas;
        int n;
        while (true){
            try {
                n = sc.nextInt();
                random_mas = new double[n];
                break;
            }
            catch (Exception e) {
                System.out.println("введите размер массива заново");
                sc.nextLine();
            }
        }
        for (int i=0; i<n; i++){
            random_mas[i]=Math.random();
        }

        System.out.println("получившийся массив с помощью Math");
        System.out.println(Arrays.toString(random_mas));

        System.out.println("отсортированный массив");
        Arrays.sort(random_mas);
        System.out.println(Arrays.toString(random_mas));

        double[] random_mas2 = new double[n];
        for (int i=0; i<n; i++){
            random_mas2[i]= new Random().nextDouble();
        }

        System.out.println("получившийся массив с помощью Random");
        System.out.println(Arrays.toString(random_mas2));

        System.out.println("отсортированный массив");
        Arrays.sort(random_mas2);
        System.out.println(Arrays.toString(random_mas2));
    }

}
