import java.awt.*;


// Driver Class
public class Lambda1 
{
	public static void main(String args[])
	{
		Frame frame = new Frame("ActionListener java8");
		
		Button b = new Button("CLick Here");
		b.setBounds(50, 100, 80, 50);
		Button b1 = new Button("Say Hi!");
		b1.setBounds(25, 20, 20, 50);
		
		b.addActionListener((e -> System.out.println("Hello World")));
		b1.addActionListener((e -> System.out.println("How are you!")));

		frame.add(b);
		frame.add(b1);
		frame.setSize(200, 200);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
