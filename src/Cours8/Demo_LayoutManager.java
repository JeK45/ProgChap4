package Cours8;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class Demo {
    JFrame frame;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;

    public Demo() {
        frame = new JFrame("ASd");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        frame.setLayout(new GridLayout(2, 3, 10, 10));
//        frame.setLayout( new FlowLayout(FlowLayout.CENTER, 30, 30));
//        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setLayout(new BorderLayout());

        btn1 = new JButton("1");
//        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn3.setPreferredSize(new Dimension( 100, 100));
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");

        JPanel panMenu = new JPanel();
        panMenu.setLayout(new BoxLayout(panMenu, BoxLayout.Y_AXIS));
        panMenu.setBackground(Color.RED);

        panMenu.add(new Button("1"));
        panMenu.add(new Button("2"));
        panMenu.add(new Button("3"));

        JPanel panContenu = new JPanel(new FlowLayout());
        panContenu.setBackground(Color.BLUE);

        panContenu.add(new Button("1"));
        panContenu.add(new Button("2"));
        panContenu.add(new Button("3"));

        frame.add(panMenu, BorderLayout.WEST);
        frame.add(panContenu,BorderLayout.CENTER);

//        frame.add(btn1, BorderLayout.NORTH);
//        frame.add(btn2, BorderLayout.SOUTH);
//        frame.add(btn3, BorderLayout.WEST);
//        frame.add(btn4, BorderLayout.EAST);
//        frame.add(btn5, BorderLayout.CENTER);
//        frame.add(btn6);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new Demo();
    }
}
