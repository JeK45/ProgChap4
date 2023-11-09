package Cours5;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

class main {
    JFrame frame;
    JLabel lblBrut, lblDeductions, lblNet;
    JTextField txtBrut, txtDeductions, txtNet;
    JButton btnCalculer, btnEffacer, btnQuitter;
    JRadioButton radDefault, radBroadway, radAlgerian;
    JCheckBox chkQuitVisible;
    ButtonGroup groupeFont;
    public main() {
        Dimension dimTxt = new Dimension(200, 30);
        Dimension dimBtn = new Dimension(125, 30);
        Dimension dimRad = new Dimension(250, 25);
        Dimension dimLbl = new Dimension(75, 30);

        frame = new JFrame("Conversion");
        frame.setSize(new Dimension(325, 345));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);

        lblBrut = new JLabel("Salaire brut");
        lblBrut.setPreferredSize(dimLbl);

        lblDeductions = new JLabel("Déductions");
        lblDeductions.setPreferredSize(dimLbl);

        lblNet = new JLabel("Salaire net");
        lblNet.setPreferredSize(dimLbl);

        txtBrut = new JTextField();
        txtBrut.setHorizontalAlignment(JTextField.RIGHT);
        txtBrut.setPreferredSize(dimTxt);

        txtDeductions = new JTextField();
        txtDeductions.setHorizontalAlignment(JTextField.RIGHT);
        txtDeductions.setPreferredSize(dimTxt);

        txtNet = new JTextField();
        txtNet.setHorizontalAlignment(JTextField.RIGHT);
        txtNet.setPreferredSize(dimTxt);
        txtNet.setEditable(false);

        btnCalculer = new JButton("Calculer");
        btnCalculer.setPreferredSize(dimBtn);
        btnCalculer.addActionListener(e -> calculer());

        btnEffacer = new JButton("Effacer");
        btnEffacer.setPreferredSize(dimBtn);
        btnEffacer.addActionListener(e -> effacer());

        btnQuitter = new JButton("Quitter");
        btnQuitter.setPreferredSize(dimBtn);
        btnQuitter.addActionListener(e -> quitter());

        radDefault = new JRadioButton("Default");
        radDefault.setPreferredSize(dimRad);
        radDefault.addActionListener(e -> fontDefault());
        radDefault.setSelected(true);

        radBroadway = new JRadioButton("Broadway");
        radBroadway.setPreferredSize(dimRad);
        radBroadway.addActionListener(e -> fontBroadway());

        radAlgerian = new JRadioButton("Algerian");
        radAlgerian.setPreferredSize(dimRad);
        radAlgerian.addActionListener(e -> fontAlgerian());

        groupeFont = new ButtonGroup();
        groupeFont.add(radDefault);
        groupeFont.add(radBroadway);
        groupeFont.add(radAlgerian);

        chkQuitVisible = new JCheckBox("Bouton Quitter visible");
        chkQuitVisible.setPreferredSize(new Dimension(200, 20));
        chkQuitVisible.addActionListener(e -> btnQuitterVisible());
        chkQuitVisible.setSelected(true);

        frame.getRootPane().setDefaultButton(btnCalculer);

        frame.add(lblBrut);
        frame.add(txtBrut);
        frame.add(lblDeductions);
        frame.add(txtDeductions);
        frame.add(lblNet);
        frame.add(txtNet);
        frame.add(btnCalculer);
        frame.add(btnEffacer);
        frame.add(radDefault);
        frame.add(radBroadway);
        frame.add(radAlgerian);
        frame.add(chkQuitVisible);
        frame.add(btnQuitter);
        frame.setVisible(true);
    }

    void calculer() {
        DecimalFormat argent = new DecimalFormat("0.00");
        Double nb = 0.;

        try {
            nb = Double.parseDouble(txtBrut.getText()) - Double.parseDouble(txtDeductions.getText());
            txtNet.setText(argent.format(nb));
        } catch (NumberFormatException e) {
            effacer();
        }

        if (nb < 0) {
            txtNet.setForeground(Color.RED);
        } else {
            txtNet.setForeground(Color.BLACK);
        }
    }

    void effacer() {
        txtBrut.setText("");
        txtDeductions.setText("");
        txtNet.setText("");
    }

    void fontDefault() {
        txtBrut.setFont(new Font("Default", txtBrut.getFont().getStyle(), txtBrut.getFont().getSize()));
        txtDeductions.setFont(new Font("Default", txtDeductions.getFont().getStyle(), txtDeductions.getFont().getSize()));
        txtNet.setFont(new Font("Default", txtNet.getFont().getStyle(), txtNet.getFont().getSize()));
    }

    void fontBroadway() {
        txtBrut.setFont(new Font("Broadway", txtBrut.getFont().getStyle(), txtBrut.getFont().getSize()));
        txtDeductions.setFont(new Font("Broadway", txtDeductions.getFont().getStyle(), txtDeductions.getFont().getSize()));
        txtNet.setFont(new Font("Broadway", txtNet.getFont().getStyle(), txtNet.getFont().getSize()));
    }

    void fontAlgerian() {
        txtBrut.setFont(new Font("Algerian", txtBrut.getFont().getStyle(), txtBrut.getFont().getSize()));
        txtDeductions.setFont(new Font("Algerian", txtDeductions.getFont().getStyle(), txtDeductions.getFont().getSize()));
        txtNet.setFont(new Font("Algerian", txtNet.getFont().getStyle(), txtNet.getFont().getSize()));
    }

    void btnQuitterVisible() {
        btnQuitter.setVisible(chkQuitVisible.isSelected());
    }

    void quitter() {
        System.exit(1111111111);
    }

    public static void main(String[] args) {
        new main();
    }
}
