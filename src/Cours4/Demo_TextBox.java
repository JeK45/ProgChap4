package Cours4;

import javax.swing.*;
import java.awt.*;

public class Demo_TextBox {
    JFrame frame;
    JTextField txtMot, txtReponse;
    JButton btnGo;

    public Demo_TextBox() {
        frame = new JFrame("Patate");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setMinimumSize(new Dimension(700, 500));
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        Dimension dimTxt = new Dimension(200, 30);

        txtMot = new JTextField();
        txtMot.setPreferredSize(dimTxt);
        txtMot.setToolTipText("Entrez un mot");

        txtReponse = new JTextField();
        txtReponse.setPreferredSize(dimTxt);
        txtReponse.setEditable(false);

        btnGo = new JButton("GO");
        btnGo.addActionListener(e -> go());

        frame.getRootPane().setDefaultButton(btnGo);
        frame.add(txtMot);
        frame.add(txtReponse);
        frame.add(btnGo);
        frame.setVisible(true);
    }

    void go() {
        Double nb = 0.0;
        try {
            nb = Double.parseDouble(txtMot.getText());
            txtMot.setForeground(Color.BLACK);
        }
        catch (NumberFormatException e) {
            txtMot.setForeground(Color.RED);
        }
         nb *= 2;
        txtReponse.setText(nb.toString());
    }

    public static void main(String[] args) {
        new Demo_TextBox();
    }
}
