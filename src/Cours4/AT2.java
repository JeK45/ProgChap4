package Cours4;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class AT2 {
    JFrame frame;
    JTextField txt;
    JLabel output;
    JButton convert1, convert2, quit;


    public AT2() {
        frame = new JFrame("Conversion");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setMinimumSize(new Dimension(250, 220));
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        Dimension dim = new Dimension(200, 30);

        txt = new JTextField("");
        txt.setHorizontalAlignment(JTextField.RIGHT);
        txt.setPreferredSize(dim);

        convert1 = new JButton("Cel to Far");
        convert1.setPreferredSize(dim);
        convert1.addActionListener(e -> celToFar());

        convert2 = new JButton("Far to Cel");
        convert2.setPreferredSize(dim);
        convert2.addActionListener(e -> farToCel());

        quit = new JButton("Quitter");
        quit.addActionListener(e -> btnQuit());

        output = new JLabel("0.00");
        output.setPreferredSize(dim);
        output.setHorizontalAlignment(JLabel.RIGHT);

        frame.add(txt);
        frame.add(convert1);
        frame.add(convert2);
        frame.add(output);
        frame.add(quit);
        frame.setVisible(true);



    }

    void celToFar() {
        DecimalFormat format = new DecimalFormat("0.00");
        Double nb = 0.;
        try {
            nb = Double.parseDouble(txt.getText());
            txt.setForeground(Color.BLACK);
        }
        catch (NumberFormatException e) {
            txt.setForeground(Color.RED);
        }
        nb = (nb * 1.8) + 32;
        output.setText(format.format(nb));
    }

    void farToCel() {
        DecimalFormat format = new DecimalFormat("0.00");
        Double nb = 0.;
        try {
            nb = Double.parseDouble(txt.getText());
            txt.setForeground(Color.BLACK);
        }
        catch (NumberFormatException e) {
            txt.setForeground(Color.RED);
        }
        nb = (nb - 32) / 1.8;
        output.setText(format.format(nb));
    }

    void btnQuit() {
        System.exit(1111111111);
    }

    public static void main(String[] args) {
        new AT2();
    }
}
