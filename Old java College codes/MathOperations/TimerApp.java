import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TimerApp extends JFrame implements ActionListener {
    private JLabel label;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;
    private int seconds = 0;

    public TimerApp() {
        setTitle("Simple Timer");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Time: 0 sec");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        add(label);

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        add(startButton);
        add(stopButton);
        add(resetButton);

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        timer = new Timer(1000, e -> {
            seconds++;
            label.setText("Time: " + seconds + " sec");
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == startButton) {
            timer.start();
        } else if (source == stopButton) {
            timer.stop();
        } else if (source == resetButton) {
            timer.stop();
            seconds = 0;
            label.setText("Time: 0 sec");
        }
    }

    public static void main(String[] args) {
        new TimerApp();
    }
}
