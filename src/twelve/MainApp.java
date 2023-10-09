package twelve;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Главный класс приложения
public class MainApp extends JFrame {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private java.util.List<Shape> shapes;

    public MainApp() {
        shapes = new java.util.ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < NUM_SHAPES; i++) {
            int shapeType = random.nextInt(2);
            int x = random.nextInt(WINDOW_WIDTH);
            int y = random.nextInt(WINDOW_HEIGHT);
            int width = random.nextInt(100) + 20;
            int height = random.nextInt(100) + 20;
            int radius = random.nextInt(50) + 10;

            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (shapeType == 0)
                shapes.add(new Circle(color, x, y, radius));
            else
                shapes.add(new Rectangle(color, x, y, width, height));
        }

        setTitle("Random Shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.setVisible(true);

        if (args.length > 0) {
            String imagePath = args[0];
            JFrame imageFrame = new JFrame();
            imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label = new JLabel(new ImageIcon(imagePath));
            imageFrame.add(label);
            imageFrame.pack();
            imageFrame.setVisible(true);
        }
    }
}
