import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void drawImage(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern
        graphics.setColor(Color.black);
        graphics.drawRect(0, 0, 20, 20);
        graphics.fillRect(0, 0, 20, 20);
//        public class CheckerboardPattern {
//            public static void main(String[] args) {

        int size = 16; // Размер доски (количество строк и столбцов)
        int x = 0;
        int y = -20;
        for (int row = 0; row < 16; row++) {
            y += 20;
            for (int column = 0; column < 16; column ++) {
                if ((row + column) % 2 == 0) {
                  x=x+20;
                    graphics.setColor(Color.black);
                    graphics.drawRect(x, y, 20, 20);
                    graphics.fillRect(x, y, 20, 20);
                    //
                } else {
                    //  x+=20;
                    graphics.setColor(Color.white);
                    graphics.drawRect(x, y, 20, 20);
                    graphics.fillRect(x, y, 20, 20);
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


