import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Label label = new Label("eneter your name:");
        label.setBounds(60, 50, 120, 30);                  //x,y,width,height

        TextField textField = new TextField();
        textField.setBounds(180, 50, 150, 30);

        Button button = new Button("Submit");
        button.setBounds(150, 100, 80, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Name entered: " + textField.getText());
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
