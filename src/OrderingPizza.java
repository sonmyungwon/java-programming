import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OrderingPizza {

	public static void main(String[] args) {
		JFrame frame = new JFrame("MyFrame"); 
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JButton button1 = new JButton("Combination Pizza");
		JButton button2 = new JButton("Potato Pizza");
		JButton button3 = new JButton("Roasted meat Pizza");
		JLabel label1 = new JLabel("Welcome to Java pizza. Choose the type of pizza.");
		JLabel label2 = new JLabel("count"); 
		JTextField field = new JTextField(10);
		
		panel1.add(label1);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(label2);
		panel2.add(field);
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.setSize(1000,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
}
