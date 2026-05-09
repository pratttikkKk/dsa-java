import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterAWT {
	public static void main(String[] args) {
		Frame f = new Frame("registration page using java");

	 Label l1 = new Label("enter your name:");
	 l1.setBounds(10,40,100,20);
	 Label l2 = new Label("enter your age:");
	 l2.setBounds(10,70,100,20);
	 Label l3 = new Label("enter your date of birth:");
	 l3.setBounds(10,100,150,20);
	 Label l4 = new Label("enter your branch:");
	 l4.setBounds(10,130,150,20);

	 TextField t1= new TextField();
	 t1.setBounds(120,40,120,20);

	  TextField t2= new TextField();
	 t2.setBounds(120,70,120,20);
	  TextField t3= new TextField();
	 t3.setBounds(170,100,200,20);
	  TextField t4= new TextField();
	 t4.setBounds(170,120,200,20);

	 Button b = new Button("submit");
	 b.setBounds(40,160,60,20);

	 b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
		System.out.println("name: " + t1.getText());
		System.out.println("age: " + t2.getText());
		System.out.println("date of birth: " + t3.getText());
		System.out.println("branch: " + t4.getText());
		}
	 
	});

	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	f.add(t1);
	f.add(t2);
	f.add(t3);
	f.add(t4);
	f.add(b);
	f.setSize(1000,1000);
	f.setLayout(null);
	f.setVisible(true);


	}
	
}
