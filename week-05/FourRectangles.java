import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void drawImage(Graphics graphics){
        // Draw four different size and color rectangles
        // Avoid code duplication!

        int upperBound  = 100;
        int lowerBound = 0;
        Random rand = new Random();
        int randomNumber =  rand.nextInt(upperBound - lowerBound);
        int randomNumber1 = rand.nextInt(upperBound - lowerBound);

        for (int i = 50; i <= 200; i+=50){

            int xOne = randomNumber+i;
            int yOne = randomNumber1+i;
            drawArectangle(xOne,yOne,graphics); //how to set for different color?
        }
//        graphics.setColor(Color.red);
//        graphics.drawRect(0, 0, 100, 200);
//        graphics.fillRect(0, 0, 100, 200);



    }

    public static void drawArectangle (int x,int y,Graphics graphics){
        graphics.setColor(Color.red);
        int width = WIDTH/2;
        int height = HEIGHT/2;

        graphics.drawRect(x, y, width, height);
        graphics.fillRect(x, y, width, height);
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
