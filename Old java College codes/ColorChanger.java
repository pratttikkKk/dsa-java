import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame implements ActionListener {
    private JComboBox<String> colorCombo;

    public ColorChanger() {
        setTitle("Background Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] colors = {"Select Color", "Red", "Green", "Blue", "Yellow", "White", "Black"};
        colorCombo = new JComboBox<>(colors);
        colorCombo.addActionListener(this);

        add(colorCombo);

        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selected = (String) colorCombo.getSelectedItem();
        if (selected != null) {
            switch (selected) {
                case "Red" -> getContentPane().setBackground(Color.RED);
                case "Green" -> getContentPane().setBackground(Color.GREEN);
                case "Blue" -> getContentPane().setBackground(Color.BLUE);
                case "Yellow" -> getContentPane().setBackground(Color.YELLOW);
                case "White" -> getContentPane().setBackground(Color.WHITE);
                case "Black" -> getContentPane().setBackground(Color.BLACK);
                default -> getContentPane().setBackground(null);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColorChanger::new);
    }
}
