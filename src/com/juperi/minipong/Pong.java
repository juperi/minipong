package com.juperi.minipong;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Pong extends JPanel {

	// Ball position
	int x = 0;
	int y = 0;

	private void moveBall() {
		x = x + 1;
		y = y + 1;
	}

	@Override
	public void paint(Graphics g) {
		
		//Call JPanel paint method. Clean screen
		super.paint(g); 
		
		//Paint ball & render
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 60, 60);
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Pong");
		Pong pong = new Pong();
		frame.add(pong);
		frame.setSize(900, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			pong.moveBall();
			pong.repaint();
			Thread.sleep(10);
		}
	}
}
