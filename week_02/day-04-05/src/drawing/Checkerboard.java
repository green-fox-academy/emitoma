package drawing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int numOfSquares = 8;
        int x = 0;
        int y = 0;
        int changeX = WIDTH / numOfSquares;
        int changeY = HEIGHT / numOfSquares;

    //first row x changes Y not
        for (int i = 0; i < numOfSquares; i++) {
            x += changeX * 2;
            checkerDraw(x, y, changeX,changeY, Color.BLACK, graphics);
        }
        for (int i = 0; i < numOfSquares; i++) {
//            x += changeX * 2;
            y += changeY;
            checkerDraw(x, y, changeX,changeY, Color.BLACK, graphics);
        }

    }

    public static void checkerDraw(int x, int y, int width, int height, Color fillColor, Graphics g) {

        g.setColor(fillColor);
        g.fillRect(x, y, width, height);
        g.setColor(new Color(158, 0, 251));
        g.drawRect(x, y, width, height);
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
