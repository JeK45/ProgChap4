package Cours5;

import javax.swing.*;
import java.awt.*;

class Demo{
    JFrame frame;
    JLabel lblNom;
    JLabel lblVide;
    JTextField txtNom;
    JButton btnOk;
    JRadioButton radRouge, radVert, radBleu;
    JCheckBox chkActif;
    ButtonGroup groupeCouleurs;

    public Demo() {
        frame = new JFrame("Demo");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLocationRelativeTo(null);

        lblNom = new JLabel("Nom : ");

        lblVide = new JLabel("");
        lblVide.setPreferredSize(new Dimension(2000, 1));

        txtNom = new JTextField();
        txtNom.setPreferredSize(new Dimension(100, 20));

        btnOk = new JButton("OK");
        btnOk.addActionListener(e -> ok());

        chkActif = new JCheckBox("Actif");
        chkActif.setSelected(true);
        chkActif.addActionListener(e -> activer());

        radRouge = new JRadioButton("Rouge");
        radRouge.addActionListener(e -> enRouge());

        radVert = new JRadioButton("Vert");
        radVert.addActionListener(e -> enVert());

        radBleu = new JRadioButton("Bleu");
        radBleu.addActionListener(e -> enBleu());

        groupeCouleurs = new ButtonGroup();
        groupeCouleurs.add(radRouge);
        groupeCouleurs.add(radVert);
        groupeCouleurs.add(radBleu);

        frame.add(lblNom);
        frame.add(txtNom);
        frame.add(btnOk);
        frame.add(chkActif);
        frame.add(lblVide);
        frame.add(radRouge);
        frame.add(radVert);
        frame.add(radBleu);
        frame.setVisible(true);
    }

    public void ok() {
        txtNom.setText(txtNom.getText() + txtNom.getText());
    }

    public void activer() {
        btnOk.setEnabled(chkActif.isSelected());
    }

    public void enRouge() {
        if (radRouge.isSelected()) {
            txtNom.setBackground(Color.RED);
        }
    }

    public void enVert() {
        if (radVert.isSelected()) {
            txtNom.setBackground(Color.GREEN);
        }
    }

    public void enBleu() {
        if (radBleu.isSelected()) {
            txtNom.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new Demo();
    }
}
