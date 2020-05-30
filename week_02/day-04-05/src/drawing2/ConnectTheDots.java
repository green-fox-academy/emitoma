package drawing2;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] boxCoordinates = {{10, 10}, {290, 10}, {290, 290}, {10, 290}, {10, 10}};
        int[][] secondCoordinates = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                {120, 100}, {85, 130}, {50, 100}};
        dotConnecter(boxCoordinates, graphics);
        dotConnecter(secondCoordinates, graphics);
    }

    public static void dotConnecter(int[][] coordinates, Graphics g) {
        for (int i = 0; i < coordinates.length - 1; i++) {
            int x = 0;
            int y = 0;
            int x2 = 0;
            int y2 = 0;
            for (int j = 0; j < 1; j++) {
                x = coordinates[i][j];
                y = coordinates[i][j + 1];
                x2 = coordinates[i + 1][j];
                y2 = coordinates[i + 1][j + 1];
            }
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke( new BasicStroke(5));
            g.setColor(new Color(10 ,150, 30));
            g.drawLine(x, y, x2, y2);
        }
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