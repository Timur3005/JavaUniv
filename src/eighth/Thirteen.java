package eighth;

import java.util.ArrayList;
import java.util.Scanner;

public class Thirteen {

    public static void main(String[] args) {
        outNumbers();
    }

    private static void outNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральные числа, завершите ввод числом 0");
        ArrayList<Integer> arrayList = new ArrayList<>();
        int c = 0;
        while (true){
            c++;
            int x = scanner.nextInt();
            if (x==0) break;
            else {
                if (c%2==1){
                    arrayList.add(x);
                }
            }
        }
        System.out.println("числа с нечетными номерами");
        System.out.println(arrayList);
    }
}
