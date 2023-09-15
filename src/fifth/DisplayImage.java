package fifth;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayImage extends JFrame {

    public DisplayImage(String imagePath) {
        // Устанавливаем заголовок окна
        setTitle("Отображение изображения");

        // Загружаем изображение
        BufferedImage image = loadImage(imagePath);

        // Создаем JLabel для отображения изображения
        assert image != null;
        JLabel label = new JLabel(new ImageIcon(image));

        // Устанавливаем размеры окна
        setSize(image.getWidth(), image.getHeight());

        // Добавляем JLabel на окно
        add(label);

        // Устанавливаем операцию закрытия окна по умолчанию
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Устанавливаем видимость окна
        setVisible(true);
    }

    private BufferedImage loadImage(String imagePath) {
        try {
            return ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Использование: java DisplayImage путь_к_изображению");
        } else {
            String imagePath = args[0];
            DisplayImage displayImage = new DisplayImage(imagePath);
        }
    }
}

