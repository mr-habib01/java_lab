//4. Write a JAVA Program to develop a simple calculator in GUI
import javax.swing.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Calculator");

        JLabel l1 = new JLabel("First Number:");
        JLabel l2 = new JLabel("Second Number:");
        JLabel l3 = new JLabel("Result:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton b1 = new JButton("+");
        JButton b2 = new JButton("-");
        JButton b3 = new JButton("*");
        JButton b4 = new JButton("/");

        l1.setBounds(30, 30, 120, 25);
        t1.setBounds(160, 30, 150, 25);

        l2.setBounds(30, 70, 120, 25);
        t2.setBounds(160, 70, 150, 25);

        l3.setBounds(30, 110, 120, 25);
        t3.setBounds(160, 110, 150, 25);
        t3.setEditable(false);

        b1.setBounds(30, 160, 60, 35);
        b2.setBounds(100, 160, 60, 35);
        b3.setBounds(170, 160, 60, 35);
        b4.setBounds(240, 160, 60, 35);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                t3.setText(String.valueOf(a + b));
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                t3.setText(String.valueOf(a - b));
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                t3.setText(String.valueOf(a * b));
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());

                if (b != 0)
                    t3.setText(String.valueOf(a / b));
                else
                    JOptionPane.showMessageDialog(f,
                        "Cannot divide by zero!");
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        f.setSize(360, 260);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
