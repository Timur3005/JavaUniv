package sixth;

import java.util.Scanner;

public class SixthTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сначала x, потом y, потом скорость в оси x, потом скорость в оси y, потом радиус, числа должны быть целыми и не должны превышать миллиона");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int xs = scanner.nextInt();
        int ys = scanner.nextInt();
        int r = scanner.nextInt();
        MovableCircle circle = new MovableCircle(x,y, xs,ys,r,new MovablePoint(x,y,xs,ys));
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
    }
}
