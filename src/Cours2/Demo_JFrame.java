package Cours2;

import javax.swing.*;
import java.awt.*;

public class Demo_JFrame {
    JFrame frame;

    public Demo_JFrame() {
        frame = new JFrame("Bonjour le big");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //frame.setBounds(10, 40, 300, 150);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        //frame.setMinimumSize(new Dimension(400, 405));
        //frame.setResizable(false);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        for (char i = '\0'; i < 127; i++ ) {
            Demo_JFrame vue = new Demo_JFrame();
        }
    }
}
