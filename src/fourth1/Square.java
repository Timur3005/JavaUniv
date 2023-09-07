package fourth1;

import java.util.Scanner;

public class Square extends Shape{

    private double a;

    Square(){
        System.out.println("введите сторону квадрата");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
    }

    @Override
    String getType() {
        return "Square";
    }

    @Override
    double getArea() {
        return a*a;
    }

    @Override
    double getPerimeter() {
        return 4*a;
    }
}
