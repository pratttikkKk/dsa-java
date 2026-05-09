import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 

class FactDemo1 extends JFrame implements ActionListener { 
    JButton b1;       
    JLabel l1, l2; 
    JTextField t1, t2;   

    public FactDemo1() { 
        setTitle("Factorial Calculator"); 

        getContentPane().setBackground(Color.YELLOW); 

        l1 = new JLabel("Enter the number: "); 
        l1.setForeground(Color.BLUE); 
        t1 = new JTextField(20); 
        t1.setBackground(Color.WHITE); 
        l2 = new JLabel("Factorial: "); 
        l2.setForeground(Color.BLUE); 
        t2 = new JTextField(20); 
        t2.setEditable(false); 
        t2.setForeground(Color.BLACK); 
        t2.setBackground(Color.WHITE); 
        b1 = new JButton("Calculate"); 

        setSize(1400, 600); 
        setLayout(new FlowLayout());  

        add(l1); 
        add(t1); 
        add(l2); 
        add(t2); 
        add(b1); 

        b1.addActionListener(this); 

        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    } 

    // Method to calculate factorial
    private long factorial(int number) {
        if (number == 0) {
            return 1; // Factorial of 0 is 1
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i; // Multiply result by i
        }
        return result;
    }

    public void actionPerformed(ActionEvent e) { 
        try {
            int number = Integer.parseInt(t1.getText()); 
            long fact = factorial(number); 
            t2.setText(Long.toString(fact)); 
        } catch (NumberFormatException ex) {
            t2.setText("Invalid input!"); 
        }
    } 

    public static void main(String[] args) {
        new FactDemo1(); 
    }
}