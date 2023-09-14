package fourth1;

import java.util.Scanner;

public class Circle implements Shape{

    private double a;



    public Circle(){
        System.out.println("введите радиус");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
    }
    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI*a*a;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*a;
    }
}
