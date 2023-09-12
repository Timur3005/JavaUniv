package eighth;

import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int count = 0;
        int countZero = 0;
        System.out.println("Вводите натуральные числа, по 1 в каждой строке");
        while (true){
            if (countZero==2){
                break;
            }
            else {
                x = scanner.nextInt();
                if (x == 0) {
                    countZero++;
                } else {
                    countZero = 0;
                    count += countOne(x);
                }
            }
        }
        System.out.println("количечтво единиц");
        System.out.println(count);
    }

    private static int countOne(Integer x){
        String sx = x.toString();

        int sum=0;

        for (int i=0;i<sx.length();i++){
            if ('1' == sx.charAt(i)){
                sum++;
            }
        }

        return sum;
    }

}
