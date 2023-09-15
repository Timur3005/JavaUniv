package seventh.math;

import java.util.Scanner;

public class SeventhTest {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга");
        double r = scanner.nextDouble();
        System.out.println("площадь круга "+mathFunc.getCircleSquare(r));
    }
}
