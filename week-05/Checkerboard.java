import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void drawImage(Graphics graphics) {

        // Fill the canvas with a checkerboard pattern

        int count = 16; // (the mount of row and column)
        int boxSize = 20;
        for (int row = 0; row < count; row++) {
            for (int column = 0; column < count; column++) {
                int y = row * boxSize;
                int x = column * boxSize;
                if ((row + column) % 2 == 0) {
                    graphics.setColor(Color.black);
                    graphics.drawRect(x, y, boxSize, boxSize);
                    graphics.fillRect(x, y, boxSize, boxSize);
                    //
                } else {
                    graphics.setColor(Color.white);
                    graphics.drawRect(x, y, boxSize, boxSize);
                    graphics.fillRect(x, y, boxSize, boxSize);
                }
            }
        }
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


