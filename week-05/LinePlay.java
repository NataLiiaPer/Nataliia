import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawImage(Graphics graphics) {
        int xOne=0;
        int yOne=20;
        for (int i = 0; i <= 320; i+=20) {

            xOne +=i;
            yOne +=i;
            lineToCenter(xOne,yOne,graphics);
        }

        for (int i = 0; i <= 320; i+=20) {

            xOne +=i;
            yOne +=i;
            lineToCenter(xOne,yOne,graphics);
        }


    }
    public static void lineToCenter (int x,int y,Graphics graphics){


        graphics.setColor(Color.magenta);
        graphics.drawLine(x, 0, 320, y);
        graphics.setColor(Color.green);
        graphics.drawLine(0, y, x, 320);
    }
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        RainbowBoxFunction.ImagePanel panel = new RainbowBoxFunction.ImagePanel();
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
