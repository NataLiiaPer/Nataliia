import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares
        // (red, orange, yellow, green, blue, indigo, violet).
        //  java.awt.*; когда ищу пример указывать эту библилтеку



//        public class RandomColorExample {
//
//            public static Color getRandomColor() {
//                Random random = new Random();
//                int red = random.nextInt(256); // Random value between 0 and 255
//                int green = random.nextInt(256);
//                int blue = random.nextInt(256);
//                return new Color(red, green, blue);
//            }
//
//            public static void main(String[] args) {
//                Color randomColor = getRandomColor();
//                System.out.println("Random Color: " + randomColor);
//            }
//        }

        int xOne=0;
        Color []array =   {Color.red, Color.orange,Color.yellow, Color.blue, new Color(64, 79, 101),new Color(131, 50, 157),Color.green};

        for (int i = array.length-1; i >= 0; i--) {
            graphics.setColor(array[i]);
           xOne=i*20;

            drawAsquare(xOne,graphics);
        }
    }

    public static void drawAsquare (int x,Graphics graphics){

        int center = WIDTH/2; //160
        int width = center-x;
        int height = center-x;


        graphics.fillRect(center-x,center-x, x *2 , x *2);
        graphics.drawRect(center-x,center-x, x *2 , x *2);

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
