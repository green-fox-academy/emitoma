package DrawingProject;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class LinesPlay2 {

    public static void mainDraw(Graphics graphics) {
        //divide canvas
        //get a smaller section and put the lines there then repeat x times
        //coordinates of first quarter
        // how many parts I want
        int parts = 4;
        //divide the height and width with tha num of parts/2
//        int newWIDTH = WIDTH / (parts / 2);
//        int newHEIGHT = HEIGHT / (parts / 2);
        HEIGHT /= (parts / 2);
        WIDTH /= (parts / 2);


        int xQ1 = 0;
        int yQ1 = 0;
        //coordinates of top right quarter Q2
//        int xQ2 = newHEIGHT;
        int xQ2 = HEIGHT;
        int yQ2 = 0;
        //Q3 bottom left
        int xQ3 = 0;
//        int yQ3 = newHEIGHT;
        int yQ3 = HEIGHT;
        //Q4 bottom right
//        int xQ4 = newHEIGHT;
        int xQ4 = HEIGHT;
//        int yQ4 = newHEIGHT;
        int yQ4 = HEIGHT;

        //lines from left

        int x = 0;
        int y = 0;
        int x2 = WIDTH;
        int y2 = 0;

        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = HEIGHT;
        int changeCoordinates = HEIGHT / 16; //I want to have 16 lines so is divide the height to get how much i need to change the coordinates

        for (int i = 0; i < parts; i++) {
//            graphics.drawRect(xQ1, yQ1, newWIDTH, newHEIGHT);
//            graphics.drawRect(xQ2, yQ2, newWIDTH, newHEIGHT);
//            graphics.drawRect(xQ3, yQ3, newWIDTH, newHEIGHT);
//            graphics.drawRect(xQ4, yQ4, newWIDTH, newHEIGHT);
            graphics.drawRect(xQ1, yQ1, WIDTH, HEIGHT);
            graphics.drawRect(xQ2, yQ2, WIDTH, HEIGHT);
            graphics.drawRect(xQ3, yQ3, WIDTH, HEIGHT);
            graphics.drawRect(xQ4, yQ4, WIDTH, HEIGHT);

            for (int j = 0; j < 16; j++) {

                y3 += changeCoordinates;
                x4 += changeCoordinates;
                graphics.setColor(Color.GREEN);
                graphics.drawLine(x3, y3, x4, y4);

                x += changeCoordinates;
                y2 += changeCoordinates;
                graphics.setColor(Color.MAGENTA);
                graphics.drawLine(x, y, x2, y2);


            }
        }


    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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