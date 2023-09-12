package eighth;

import java.util.ArrayList;
import java.util.Scanner;

public class Twelve {

    public static void main(String[] args) {
        count();
    }

    private static void count(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральные числа, завершите ввод числом 0");
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true){
            int x = scanner.nextInt();
            if (x==0) break;
            else {
                if (x%2==1){
                    arrayList.add(x);
                }
            }
        }
        System.out.println("нечетые числа");
        System.out.println(arrayList);
    }
}
