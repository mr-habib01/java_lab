//3. Write a JAVA Program to Create a Student form in GUI
import javax.swing.*;
import java.awt.event.*;

public class StudentForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Form");

        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Student ID:");
        JLabel l3 = new JLabel("Email:");
        JLabel l4 = new JLabel("Department:");
        JLabel l5 = new JLabel("Gender:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        String dept[] = {"ICE", "CSE", "EEE"};
        JComboBox<String> cb = new JComboBox<>(dept);

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JButton b = new JButton("Submit");

        l1.setBounds(30, 30, 100, 25);
        t1.setBounds(140, 30, 200, 25);

        l2.setBounds(30, 70, 100, 25);
        t2.setBounds(140, 70, 200, 25);

        l3.setBounds(30, 110, 100, 25);
        t3.setBounds(140, 110, 200, 25);

        l4.setBounds(30, 150, 100, 25);
        cb.setBounds(140, 150, 200, 25);

        l5.setBounds(30, 190, 100, 25);
        r1.setBounds(140, 190, 80, 25);
        r2.setBounds(220, 190, 100, 25);

        b.setBounds(140, 240, 100, 35);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gender = "";

                if (r1.isSelected())
                    gender = "Male";
                else if (r2.isSelected())
                    gender = "Female";

                JOptionPane.showMessageDialog(f,
                    "Name: " + t1.getText() +
                    "\nStudent ID: " + t2.getText() +
                    "\nEmail: " + t3.getText() +
                    "\nDepartment: " + cb.getSelectedItem() +
                    "\nGender: " + gender);
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(cb);
        f.add(l5);
        f.add(r1);
        f.add(r2);
        f.add(b);

        f.setSize(450, 350);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
