package fifth;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayImage extends JFrame {

    public DisplayImage(String imagePath) {
        setTitle("Отображение изображения");
        BufferedImage image = loadImage(imagePath);

        assert image != null;
        JLabel label = new JLabel(new ImageIcon(image));

        setSize(image.getWidth(), image.getHeight());

        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

