package drawing;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

        //spiral -almost
//        for (int i = 0; i < WIDTH; i++) {
//            int x = WIDTH - 10;
//            int y = i * 10;
////            int y = random.nextInt(320);
//            goToCenter(x, y, graphics);
//        }

       // very random
        Random random = new Random();
        int callFunc = random.nextInt(100 - 3 + 1);

        for (int i = 0; i < callFunc; i++) {
            int x = random.nextInt(320);
            int y = random.nextInt(320);
            goToCenter(x, y, graphics);
        }


    }

    public static void goToCenter(int x, int y, Graphics graphics) {
        //center of the canvas
        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;

        //get a random color
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int r = random.nextInt(255);
            int g = random.nextInt(255);
            int b = random.nextInt(255);
            graphics.setColor(new Color(r, g, b));
            graphics.drawLine(x, y, centerX, centerY);
        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("GoTOCenter");
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
