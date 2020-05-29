package DrawingProject;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class LinePlay {

    public static void mainDraw(Graphics graphics) {
        //lines from left

        int x = 0;
        int y = 0;
        int x2 = WIDTH;
        int y2 = 0;

        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = HEIGHT;

        for (int i = 0; i < 15; i++) {
            x += 20;
//            y += 0;
//            x2 += 0       ;
            y2 += 20;

//            x3 += 0;
            y3 += 20;
            x4 += 20;
//            y4 += 0;

            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(x, y, x2, y2);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x3, y3, x4, y4);


        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("LinePlay");
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
            this.setBackground(Color.GRAY);
        }
    }
}