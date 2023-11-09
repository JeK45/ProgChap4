package Cours6;

import javax.swing.*;
import java.awt.*;

class Demo {
    JFrame frame;
    JTextArea txaTexte;
    JButton btnOK;
    JScrollPane scrText;
    public Demo() {
        frame = new JFrame("a");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());

//        txaTexte = new JTextArea("T'es vraiment obèse morbide", 10, 10);
        txaTexte = new JTextArea("T'es vraiment obèse morbide");
//        txaTexte.setRows(12);
//        txaTexte.setColumns(2);
        txaTexte.setText("un\ndeux\nquatre");
        txaTexte.setLineWrap(true);
        txaTexte.setWrapStyleWord(true);

        scrText = new JScrollPane(txaTexte);
        scrText.setPreferredSize(new Dimension(100, 100));

        btnOK = new JButton("OK");
        btnOK.addActionListener(e -> faireOK());

        frame.add(scrText);
        frame.add(btnOK);
        frame.setVisible(true);
    }

    void faireOK() {
//        txaTexte.setText(txaTexte.getText() + "\nPATATE");
//        txaTexte.append("\nPATATES");
//        txaTexte.insert("\n GROSSES", 12);
//        txaTexte.replaceRange("euh patate criss", 0, 10);
//        System.out.println(txaTexte.getLineCount());

        String[] tab = txaTexte.getText().split("\n");
        tab[2] = "trois";
        txaTexte.setText(String.join("\n", tab));
    }

    public static void main(String[] args) {
        new Demo();
    }
}
