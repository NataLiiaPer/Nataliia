import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawImage(Graphics graphics) {

        for (int i = 0; i <= WIDTH; i += 20) {
            lineToCenter(i, i+20, graphics); //i = 0, 20, 40, ...

        }


    }

    public static void lineToCenter(int x, int y, Graphics graphics) {
        graphics.setColor(Color.green);
        graphics.drawLine(0, x, y, WIDTH);
        graphics.setColor(Color.magenta);
        graphics.drawLine(x, 0, WIDTH, y);

    }

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
