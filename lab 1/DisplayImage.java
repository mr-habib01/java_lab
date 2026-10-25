import javax.swing.*;

public class DisplayImage {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Image");

        ImageIcon image = new ImageIcon("image.jpg");
        JLabel label = new JLabel(image);

        frame.add(label);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}