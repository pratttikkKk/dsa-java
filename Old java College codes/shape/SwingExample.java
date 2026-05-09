import javax.swing.*;
import java.awt.event.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        JLabel label = new JLabel("Enter your name:");
        label.setBounds(20, 50, 120, 30);

        JTextField textField = new JTextField();
        textField.setBounds(150, 50, 150, 30);

        JButton button = new JButton("Submit");
        button.setBounds(100, 100, 80, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Name entered: " + textField.getText());
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
