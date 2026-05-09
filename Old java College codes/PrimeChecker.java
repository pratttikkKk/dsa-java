import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrimeChecker extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton checkButton;
    private JLabel resultLabel;

    public PrimeChecker() {
        setTitle("Prime Number Checker");
        setSize(350, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField = new JTextField(10);
        checkButton = new JButton("Check");
        resultLabel = new JLabel("Enter a number and click Check");

        checkButton.addActionListener(this);

        add(new JLabel("Number:"));
        add(inputField);
        add(checkButton);
        add(resultLabel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(inputField.getText());
            if (num <= 1) {
                resultLabel.setText(num + " is not prime.");
                return;
            }
            if (isPrime(num)) {
                resultLabel.setText(num + " is a prime number.");
            } else {
                resultLabel.setText(num + " is not a prime number.");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid integer.");
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PrimeChecker::new);
    }
}
