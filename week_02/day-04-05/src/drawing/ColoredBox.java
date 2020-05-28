package drawing;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

//        Random random = new Random();
//        int r =0;
//        int g =0;
//        int b = 0;
//        for (int i = 0; i <4 ; i++) {
//            r = random.nextInt(255);
//            g = random.nextInt(255);
//            b = random.nextInt(255);
//        }


        int margin = 100;
        int x1 = 0 + 100;
        int x2 = WIDTH - margin;
        int y1 = 0 + 100;
        int y2 = HEIGHT - margin;

        graphics.setColor(Color.RED);
        graphics.drawLine(x1, y1, x2, y1);

        graphics.setColor(Color.BLUE);
        graphics.drawLine(x2, y1, x2, y2);

        graphics.setColor(Color.CYAN);
        graphics.drawLine(x2, y2, x1, y2);

        graphics.setColor(Color.pink);
        graphics.drawLine(x1, y2, x1, y1);

    }

//    public static void randomColor(int r, int g, int b) {
//        Random random = new Random();
//
//        for (int i = 0; i < 4; i++) {
//            r = random.nextInt(255);
//            g = random.nextInt(255);
//            b = random.nextInt(255);
//        }
//
//    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
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
        }
    }
}
