package third;

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
        int n = sc.nextInt();
        double[] random_mas = new double[n];
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
