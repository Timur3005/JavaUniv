package fourth1;

import java.util.Scanner;

public class Square implements Shape{

    private double a;

    Square(){
        System.out.println("введите сторону квадрата");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }
}
