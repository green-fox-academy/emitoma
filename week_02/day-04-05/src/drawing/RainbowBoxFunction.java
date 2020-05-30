package drawing;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        ArrayList<Color> rainbow = new ArrayList<>();
        rainbow.add(Color.RED);
        rainbow.add(Color.ORANGE);
        rainbow.add(Color.YELLOW);
        rainbow.add(Color.GREEN);
        rainbow.add(Color.BLUE);
        rainbow.add(new Color(75, 0, 130));
        rainbow.add(new Color(238, 130, 238));
        int size = 20;


        for (int i = rainbow.size() - 1; i >= 0; i--) {
            size = (i * 40);
            Color myColor = rainbow.get(i);

            squareDrawer(size, myColor, graphics);
        }

    }

    public static void squareDrawer(int size, Color fillColor, Graphics g) {

        int xCenter = (WIDTH / 2) - (size / 2); // coordinates of the top left corner of the square
        int yCenter = (HEIGHT / 2) - (size / 2); // coordinates of the top left corner of the square

        g.setColor(fillColor);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(20));
        g.fillRect(xCenter, yCenter, size, size);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("RainbowBow");
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
