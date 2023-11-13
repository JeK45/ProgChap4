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
        Dimension dimTxa = new Dimension(150, 300);

        frame = new JFrame("Atelier 4-4");
        frame.setSize(340, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        input = new JTextField();
        input.setPreferredSize(new Dimension(210, 25));

        btnAjouter = new JButton("Ajouter");
        frame.getRootPane().setDefaultButton(btnAjouter);
        btnAjouter.setPreferredSize(new Dimension(90, 25));
        btnAjouter.addActionListener(e -> actionAjouter());

        btnChr = new JButton("Nombre car dans txa1");
        btnChr.setPreferredSize(new Dimension(210, 25));
        btnChr.addActionListener(e -> actionNbCar());

        btnPos = new JButton("Copier nombres positifs txa1 > txa2");
        btnPos.setPreferredSize(new Dimension(250, 25));
        btnPos.addActionListener(e -> actionPos());

        btnQuit = new JButton("Quitter");
        btnQuit.addActionListener(e -> actionQuitter());

        lbl = new JLabel("JLabel");

        txa1 = new JTextArea();
        txa1.setPreferredSize(dimTxa);

        txa2 = new JTextArea();
        txa2.setPreferredSize(dimTxa);

        frame.add(input);
        frame.add(btnAjouter);
        frame.add(txa1);
        frame.add(txa2);
        frame.add(btnChr);
        frame.add(lbl);
        frame.add(btnPos);
        frame.add(btnQuit);
        frame.setVisible(true);
    }

    void actionAjouter() {
        if (!input.getText().equals("")) {
            txa1.insert(input.getText() + "\n", 0);
            input.setText("");
        }
        input.requestFocus();
    }

    void actionNbCar() {
        int nb = 0;
        for (int i = 0; i < txa1.getText().length(); i++) {
            if (Character.isDigit(txa1.getText().charAt(i))) {
                nb++;
            }
        }
        lbl.setText(Integer.toString(nb));
    }

    void actionPos() {
        String[] tab = txa1.getText().split("\n");
        double nb;

        for (int i = 0; i < tab.length; i++) {
            try {
                nb = Double.parseDouble(tab[i]);
                if (nb >= 0) {
                    txa2.insert(nb + "\n", 0);
                }
            }
            catch (NumberFormatException e) {}
        }
    }
    void actionQuitter(){
        System.exit(0);
    }

    public static void main(String[] args) {
        new AT4();
    }
}
