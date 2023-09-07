package fourth1;

import java.util.Scanner;

public class Rectangle extends Shape{
    private double a;
    private double b;
    private double c;


    public Rectangle(){
        System.out.println("введите стороны треугольника");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
    }
    @Override
    String getType() {
        return "Circle";
    }

    @Override
    double getArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    double getPerimeter() {
        return a+b+c;
    }
}
