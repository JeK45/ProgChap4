package Cours2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Demo_JFrame {
    JFrame frame;

    public Demo_JFrame() {
        frame = new JFrame("Bonjour le big");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //frame.setBounds(10, 40, 300, 150);
        //frame.setMinimumSize(new Dimension(400, 405));
        //frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20000; i++ ) {
            Popup popup = new Popup();
        }
    }

     static class Popup {
        JFrame frame;

        Popup() {
            frame = new JFrame("oasd");
            Random random = new Random();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Color color = new Color(random.nextInt());
            frame.getContentPane().setBackground(color);
            frame.setBounds(random.nextInt(3840), random.nextInt(2160), random.nextInt(1400) + 100, random.nextInt(1400) + 100);
            frame.setVisible(true);
        }
    }
}
