package Gui;

import java.awt.Graphics;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public int x=20 ,y=20;
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(x, y, 20, 20);

	}
}
