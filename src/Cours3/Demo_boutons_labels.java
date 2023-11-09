package Cours3;

import javax.swing.*;
import java.awt.*;

class Demo_boutons_labels {

    JFrame frame;
    JLabel label1;
    JLabel label2;
    JButton btn1, btn2, btn3;

    public Demo_boutons_labels() {
        frame = new JFrame("Bonjour le big");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setMinimumSize(new Dimension(700, 500));
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        Font font = new Font("VCR OSD MONO", Font.BOLD | Font.ITALIC, 20);

        Dimension dim = new Dimension(500, 200);

//        label1 = new JLabel("Bonsouère");
//        label1.setFont(font);
//        label1.setText("Bonjour je suis un con");
//        System.out.println(label1.getText());
//        label1.setForeground(Color.GREEN);
//        label1.setHorizontalAlignment(0);
//        label1.setPreferredSize(dim);
//        frame.add(label1);

        label2 = new JLabel("Bounsouère");
        label2.setFont(font);
        frame.add(label2);

        btn1 = new JButton("OK");
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setFont(new Font("Arial", Font.BOLD, 10));
        btn1.addActionListener(e -> ok());
        frame.add(btn1);

        btn2 = new JButton("MAJ");
        btn2.setBackground(Color.LIGHT_GRAY);
        btn2.setFont(new Font("Arial", Font.BOLD, 10));
        btn2.addActionListener(e -> majuscule());
        frame.add(btn2);

        btn3 = new JButton("X");
        btn3.setBackground(Color.LIGHT_GRAY);
        btn3.setFont(new Font("Arial", Font.BOLD, 10));
        btn3.addActionListener(e -> quit());
        frame.add(btn3);

        frame.getRootPane().setDefaultButton(btn1);

        frame.setVisible(true);
    }

    public void ok() {
        label2.setText(label2.getText() + "e");
    }

    void majuscule() {
        label2.setText(label2.getText().toUpperCase());
    }

    void quit() {
        System.exit(69);
    }
    public static void main(String[] args) {
        new Demo_boutons_labels();
    }
}
