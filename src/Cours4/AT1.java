package Cours4;

import javax.swing.*;
import java.awt.*;

public class AT1 {

        JFrame frame;
        JLabel lUn, lDeux;
        JTextField txtUn, txtDeux;
        JButton btnOK, btnQuit;

    public AT1() {
        frame = new JFrame("C4 Atelier1 - JTextField");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500, 100));
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        Dimension dimTxt = new Dimension(200, 30);

        lUn = new JLabel("Un");

        lDeux = new JLabel("Deux");

        txtUn = new JTextField();
        txtUn.setPreferredSize(dimTxt);

        txtDeux = new JTextField();
        txtDeux.setPreferredSize(dimTxt);

        btnOK = new JButton("GO");
        btnOK.addActionListener(e -> btnOKAction7());

        btnQuit = new JButton("Quitter");
        btnQuit.addActionListener(e -> btnQuitAction());

        frame.getRootPane().setDefaultButton(btnOK);
        frame.add(lUn);
        frame.add(txtUn);
        frame.add(lDeux);
        frame.add(txtDeux);
        frame.add(btnOK);
        frame.add(btnQuit);
        frame.setVisible(true);
    }

    void btnOKAction1() {
        txtUn.setText("Jeremy Karazivan");
        txtDeux.setText("Programmation 1");
    }

    void btnOKAction2() {
        txtDeux.setText(txtUn.getText() + txtDeux.getText());
    }

    void btnOKAction3() {
        txtDeux.setText(txtUn.getText());
    }

    void btnOKAction4() {
        txtDeux.setText(txtUn.getSelectedText());
    }

    void btnOKAction5() {
        txtUn.setHorizontalAlignment(JTextField.RIGHT);
        txtDeux.setHorizontalAlignment(JTextField.RIGHT);
    }

    void btnOKAction6() {
        txtUn.setEditable(false);
        txtDeux.setEnabled(false);
    }

    void btnOKAction7() {
        System.out.println(txtUn.getFont());
    }

    void btnOKAction8() {
        txtUn.setBackground(Color.YELLOW);
        txtUn.setForeground(Color.BLUE);
        txtUn.setFont(new Font("", Font.BOLD, 24));
    }

    void btnQuitAction() {
        System.exit(0);
    }

    public static void main(String[] args) {
        new AT1();
    }
}
