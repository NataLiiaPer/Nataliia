import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void drawImage(Graphics graphics){
        // Create a function that takes 3 parameters and draws one square
        // Parameters: the x and y coordinates of the square's top left corner and the graphics
        // The function shall draw a 50x50 square from that point
        // Draw 3 squares with that function
        // Avoid code duplication!

        int upperBound  = 100;
        int lowerBound = 0;
        Random rand = new Random();
        int randomNumber =  rand.nextInt(upperBound - lowerBound);
        int randomNumber1 =  rand.nextInt(upperBound - lowerBound);

        for (int i = 50; i <= 150; i+=50) {

            int xOne = randomNumber+i;
            int yOne = randomNumber1+i;
            drawAsquare(xOne,yOne,graphics);
        }

    }

    public static void drawAsquare (int x,int y,Graphics graphics){

        int width = 50;
        int height = 50;

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
