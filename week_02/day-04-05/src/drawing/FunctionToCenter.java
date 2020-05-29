package drawing;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int starterx = 0;
        int startery = 0;
        Color myColor = Color.RED;
        for (int i = 0; i < WIDTH / 20; i++) {
            starterx += 20;
            myColor = Color.ORANGE;
            goToCenter(starterx, startery, myColor, graphics);
        }
        for (int j = 0; j < HEIGHT / 20; j++) {
            startery += 20;
        myColor = Color.YELLOW;
            goToCenter(starterx, startery,myColor, graphics);
        }
        for (int i = HEIGHT/20; i > 0; i--) {
            starterx -= 20;
        myColor = Color.GREEN;

            goToCenter(starterx, startery,myColor, graphics);
        }
        for (int i = HEIGHT/20; i > 0; i--) {
            startery -= 20;
            myColor = Color.BLUE;

            goToCenter(starterx, startery,myColor, graphics);
        }

    }

    public static void goToCenter(int x, int y,Color fillColor, Graphics graphics) {
        //center of the canvas
        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;
        graphics.setColor(fillColor);
        graphics.drawLine(x, y, centerX, centerY);

        //get a random color
//        Random random = new Random();
//        for (int i = 0; i < 3; i++) {
//            int r = random.nextInt(255);
//            int g = random.nextInt(255);
//            int b = random.nextInt(255);
//            graphics.setColor(new Color(r, g, b));
//            graphics.drawLine(x, y, centerX, centerY);
//        }

    }

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
