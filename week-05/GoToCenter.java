
    import javax.swing.*;

import java.awt.*;
    import java.util.Random;


    import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class GoToCenter {

        public static void drawImage(Graphics graphics) {
            // Create a function that takes 3 parameters and draws a single line
            // Parameters: the x and y coordinates of the line's starting point and the graphics
            // The function shall draw a line from that point to the center of the canvas
            // Draw at least 3 lines with that function using a loop


        //   lineToCenter(xOne,yOne,graphics);
            int upperBound  = 100;
            int lowerBound = 0;
            Random rand = new Random();
            int randomNumber =  rand.nextInt(upperBound - lowerBound);
            int randomNumber1 = rand.nextInt(upperBound - lowerBound);

            for (int i = 50; i <= 150; i+=50) {

                int xOne = randomNumber+i;
                int yOne = randomNumber1+i;
                lineToCenter(xOne,yOne,graphics);
            }

            }


       public static void lineToCenter (int x,int y,Graphics graphics){
           int theEnd = WIDTH/2;
           graphics.drawLine(x, y, theEnd, theEnd);

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

