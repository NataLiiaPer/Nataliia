import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]
//        int upperBound  = 100;
//        int lowerBound = 0;
//        Random rand = new Random();
//        int randomNumber =  rand.nextInt(upperBound - lowerBound);
//        int randomNumber1 =  rand.nextInt(upperBound - lowerBound);

        for (int i = 10; i <= 200; i+=10) { // why the squares is connected?

            int xOne = 10+i;
            int yOne = 10+i;
            drawAsquare(xOne,yOne,graphics);
        }
    }

    public static void drawAsquare (int x,int y,Graphics graphics){

        int width = 10;
        int height = 10;

        graphics.setColor(Color.magenta);
        graphics.fillRect(x, y, width, height);
        graphics.drawRect(x, y, width, height);

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
            drawImage(graphics);
        }
    }
}
