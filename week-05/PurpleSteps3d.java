import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]
        int side = 0;
        int xOne = 10;
        int yOne = 10;
        for (int i = 0; i <= 5; i ++) { // why the squares is not connected?
            xOne +=side;
            yOne +=side;
            side += 12;

            drawA3Dsquare(xOne, yOne, side, graphics);
        }
    }

    public static void drawA3Dsquare(int x, int y, int side, Graphics graphics) {

        graphics.setColor(Color.magenta);
        graphics.fillRect(x, y, side, side);
        graphics.drawRect(x, y, side, side);

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
