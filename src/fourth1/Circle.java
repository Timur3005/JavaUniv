package fourth1;

import java.util.Scanner;

public class Circle extends Shape{

    private double a;



    public Circle(){
        System.out.println("введите радиус");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
    }
    @Override
    String getType() {
        return "Circle";
    }

    @Override
    double getArea() {
        return Math.PI*a*a;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*a;
    }
}
