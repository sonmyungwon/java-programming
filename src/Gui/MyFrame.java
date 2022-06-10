package Gui;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	MyFrame() {
		MyPanel la = new MyPanel();
		MyMouseListener mml = new MyMouseListener(la);
		this.addMouseListener(mml);
		this.add(la);
		la.setLayout(null);
		this.setSize(500, 500);
		this.setTitle("Mouse Event Example"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		}
}
