package DrawingProject;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int x1 = 0;
        int x2 = WIDTH;
        int y = HEIGHT;
        int changeCoordinates = WIDTH / 20;
        // horizontal lines
        for (int i = 0; i < 20; i++) {
            x1 += changeCoordinates;
            y -= changeCoordinates;
            x2 -= changeCoordinates;
            graphics.drawLine(x1, y, x2, y);
        }
        //lines from left
        int x3 = 0;
        int y3 = HEIGHT;
        int x4 = WIDTH / 2;
        int y2 = HEIGHT / 2;
        for (int i = 0; i < 20; i++) {
            x3 += changeCoordinates;
            y3 += changeCoordinates;
            x4 += changeCoordinates;
            y2 += changeCoordinates;

            graphics.setColor(Color.RED);
            graphics.drawLine(x3, y3, x4, y2);
        }


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Triangles");
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