import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private double num1 = 0, num2 = 0, result = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    public Calculator() {
        setTitle("Standard Calculator");
        setSize(600, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Display field
        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        // Buttons
        String[] buttonLabels = {
    "C", "⌫", "", "", "",
    "7", "8", "9", "/", "sqrt",
    "4", "5", "6", "*", "x²",
    "1", "2", "3", "-", "x³",
    "0", ".", "=", "+", "%"
};


        JPanel panel = new JPanel(new GridLayout(6, 5, 5, 5));

        for (String label : buttonLabels) {
            JButton btn = new JButton(label);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        DecimalFormat df = new DecimalFormat("#.######");
        // Clear button
        if (cmd.equals("C")) {
            display.setText("0");
            num1 = num2 = result = 0;
            operator = "";
            startNewNumber = true;
            return;
        }

        // Backspace button
        if (cmd.equals("⌫")) {
            String current = display.getText();
            if (current.length() > 1) {
                display.setText(current.substring(0, current.length() - 1));
            } else {
                display.setText("0");
                startNewNumber = true;
            }
            return;
        }


        if (cmd.matches("[0-9]")) {
            if (startNewNumber) {
                display.setText(cmd);
                startNewNumber = false;
            } else {
                display.setText(display.getText().equals("0") ? cmd : display.getText() + cmd);
            }
        } else if (cmd.equals(".")) {
            if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        } else if (cmd.matches("[+\\-*/%]")) {
            num1 = Double.parseDouble(display.getText());
            operator = cmd;
            startNewNumber = true;
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num2 != 0 ? num1 / num2 : 0; break;
                case "%": result = num1 % num2; break;
            }
            display.setText(df.format(result));
            startNewNumber = true;
        } else if (cmd.equals("sqrt")) {
            double val = Double.parseDouble(display.getText());
            display.setText(df.format(Math.sqrt(val)));
            startNewNumber = true;
        } else if (cmd.equals("x²")) {
            double val = Double.parseDouble(display.getText());
            display.setText(df.format(val * val));
            startNewNumber = true;
        } else if (cmd.equals("x³")) {
            double val = Double.parseDouble(display.getText());
            display.setText(df.format(val * val * val));
            startNewNumber = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }
}
