package third;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdRandom {

    private final Scanner sc;

    public ThirdRandom(Scanner sc) {
        this.sc = sc;
    }

    protected void third(){
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
