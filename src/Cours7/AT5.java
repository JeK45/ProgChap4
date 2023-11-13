package Cours7;

import javax.swing.*;
import java.awt.*;

class AT5 {
    JFrame frame;
    JLabel lblPrenom, lblNom, lblAge;
    JTextField txtPrenom, txtNom, txtAge;
    JButton btnOK, btnEffacer, btnQuitter;
    public AT5() {
        Dimension dimLbl = new Dimension(50, 30);
        Dimension dimTxt = new Dimension(200, 30);
        Dimension dimBtn = new Dimension(80,30);

        frame = new JFrame("ASd");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        lblPrenom = new JLabel("Prénom");
        lblPrenom.setPreferredSize(dimLbl);

        lblNom = new JLabel("Nom");
        lblNom.setPreferredSize(dimLbl);

        lblAge = new JLabel("Âge");
        lblAge.setPreferredSize(dimLbl);

        txtPrenom = new JTextField();
        txtPrenom.setPreferredSize(dimTxt);

        txtNom = new JTextField();
        txtNom.setPreferredSize(dimTxt);

        txtAge = new JTextField();
        txtAge.setPreferredSize(dimTxt);

        btnOK = new JButton("Ok");
        btnOK.setPreferredSize(dimBtn);
        btnOK.addActionListener(e -> actionOK());

        btnEffacer = new JButton("Effacer");
        btnEffacer.setPreferredSize(dimBtn);
        btnEffacer.addActionListener(e -> actionEffacer());

        btnQuitter = new JButton("Quitter");
        btnQuitter.setPreferredSize(dimBtn);
        btnQuitter.addActionListener(e -> actionQuitter());

        frame.getRootPane().setDefaultButton(btnOK);

        frame.add(lblPrenom);
        frame.add(txtPrenom);
        frame.add(lblNom);
        frame.add(txtNom);
        frame.add(lblAge);
        frame.add(txtAge);
        frame.add(btnOK);
        frame.add(btnEffacer);
        frame.add(btnQuitter);
        frame.setVisible(true);
    }

    void actionOK() {
        try {
            Integer.parseInt(txtAge.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    frame,
                    "L'âge n'est pas valide",
                    "Erreur de données",
                    JOptionPane.ERROR_MESSAGE
            );
            txtAge.requestFocus();
        }
    }

    void actionEffacer() {
        int reponse = JOptionPane.showConfirmDialog(
                frame,
                "Attention",
                "Voulez-vous vraiment effacer?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
        if (reponse == JOptionPane.YES_OPTION) {
            txtAge.setText("");
            txtPrenom.setText("");
            txtNom.setText("");

            JOptionPane.showMessageDialog(
                    frame,
                    "Les données sont effacées",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    void actionQuitter() {
        int reponse = JOptionPane.showConfirmDialog(
                frame,
                "Voulez-vous vraiment quitter?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        if (reponse == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new AT5();
    }
}
