import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField number1Field;
    private JTextField number2Field;
    private JTextField resultField;
    private JButton addButton;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        JLabel number1Label = new JLabel("Enter first number: ");
        number1Field = new JTextField(10);
        JLabel number2Label = new JLabel("Enter second number: ");
        number2Field = new JTextField(10);
        JLabel resultLabel = new JLabel("Result: ");
        resultField = new JTextField(10);
        resultField.setEditable(false);
        addButton = new JButton("Add");

        setLayout(new FlowLayout());
        add(number1Label);
        add(number1Field);
        add(number2Label);
        add(number2Field);
        add(addButton);
        add(resultLabel);
        add(resultField);

        addButton.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(number1Field.getText());
            double num2 = Double.parseDouble(number2Field.getText());
            double sum = num1 + num2;
            resultField.setText(Double.toString(sum));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input!");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}