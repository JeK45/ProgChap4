package Cours6;

import javax.swing.*;
import java.awt.*;

class AT4 {
    JFrame frame;
    JTextField input;
    JButton btnAjouter, btnChr, btnPos, btnQuit;
    JLabel lbl;
    JTextArea txa1, txa2;
    public AT4() {
        frame = new JFrame("Atelier 4-4");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());


    }

    public static void main(String[] args) {
        new AT4();
    }
}
