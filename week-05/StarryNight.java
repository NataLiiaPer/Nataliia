import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

//        int upperBound = 200;
//        int lowerBound = 0;
//        Random rand = new Random();
//        int randomNumber = rand.nextInt(upperBound - lowerBound);
//        int randomNumber1 = rand.nextInt(upperBound - lowerBound);
//        int randomNumber3 = rand.nextInt(upperBound - lowerBound);
//        int xOne = randomNumber;
//        int yOne = randomNumber1;
                graphics.setColor(Color.black);
        graphics.drawRect(0, 0, 320, 320);
        graphics.fillRect(0, 0, 320, 320);
        for (int i = 1; i <= 150; i += 10) {
            int upperBound = 250;
            int lowerBound = 10;
            int upperBound1 = 30;
            int lowerBound2 = 10;
            Random rand = new Random();
            int randomNumber = rand.nextInt(upperBound - lowerBound);
            int randomNumber1 = rand.nextInt(upperBound - lowerBound);
            int randomNumber3 = rand.nextInt(upperBound1 - lowerBound2);
            int randomNumber4 = rand.nextInt(upperBound1 - lowerBound2);
            randomNumber += randomNumber3;
            randomNumber1 +=randomNumber4;

            night(randomNumber, randomNumber1, graphics);

        }
    }

    public static void night(int x, int y, Graphics graphics) {
        int width = WIDTH;
        int height = HEIGHT;



        graphics.setColor(new Color(131, 126, 125));
        graphics.drawRect(x, y, 10, 10);
        graphics.fillRect(x, y, 10, 10);

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