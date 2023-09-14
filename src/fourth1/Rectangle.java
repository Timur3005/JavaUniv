package fourth1;

import java.util.Scanner;

public class Rectangle implements Shape{
    private double a;
    private double b;


    public Rectangle(){
        System.out.println("введите стороны прямоугольника");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
    }
    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return (a+b)*2;
    }
}
