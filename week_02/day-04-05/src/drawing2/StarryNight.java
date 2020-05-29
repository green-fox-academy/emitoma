package drawing2;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        Random random = new Random();
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
//        graphics.setColor(Color.BLACK);
//        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        for (int i = 0; i < 500; i++) {
            int x = random.nextInt(WIDTH - 10);
            int y = random.nextInt(HEIGHT - 10);
            int size = random.nextInt(10);
            int greyColor = random.nextInt(255);


            graphics.setColor(new Color(greyColor, greyColor, greyColor));
//            this.setBackground(Color.BLACK);
            graphics.fillRect(x, y, size, size);
        }
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("StarryNight");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
            this.setBackground(Color.BLACK);
        }
    }
}
