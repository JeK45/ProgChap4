package Cours7;

import javax.swing.*;
import java.awt.*;

class Demo {
    JFrame frame;
    JButton btn;

    public Demo() {
        frame = new JFrame("ASd");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        btn = new JButton("OK");
        btn.addActionListener(e -> btnOK());

        frame.add(btn);
        frame.setVisible(true);
    }

    void btnOK() {
        String reponse;
        do {
            reponse = JOptionPane.showInputDialog(
                    frame,
                    "Gros criss",
                    "Obese"
//                JOptionPane.ERROR_MESSAGE
            );
        } while (reponse == null || reponse.equals(""));
        System.out.println(reponse);


//        int reponse = JOptionPane.showConfirmDialog(
//                frame,
//                "euhh",
//                "Question",
//                JOptionPane.YES_NO_OPTION,
//                JOptionPane.QUESTION_MESSAGE
//        );
//
//        if (reponse == JOptionPane.YES_OPTION) {
//            JOptionPane.showMessageDialog(
//                frame,
//                "EILLE SIMONAC T'AS UN VIRUS TABARNAK",
//                "ATTENTION VIRUS -INDE",
//                JOptionPane.WARNING_MESSAGE
//            );
//        }
    }
    public static void main(String[] args) {
        new Demo();
    }
}
