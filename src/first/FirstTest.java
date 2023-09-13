package first;

import java.util.Scanner;

public class FirstTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        First first = new First(scanner);
        first.third();
        System.out.println("3 пункт завершился");
        first.fourth();
        System.out.println("4 пункт завершился");
        first.fifth(args);
        System.out.println("5 пункт завершился");
    }
}
