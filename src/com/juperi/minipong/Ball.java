package com.juperi.minipong;

import java.awt.Graphics2D;

public class Ball {
	
	// Ball position
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	
	private Pong pong;

	public Ball(Pong pong) {
		this.pong= pong;
	}

	void move() {
		if (x + xa < 0)
			xa = 1;
		if (x + xa > pong.getWidth() - 30)
			xa = -1;
		if (y + ya < 0)
			ya = 1;
		if (y + ya > pong.getHeight() - 30)
			ya = -1;

		x = x + xa;
		y = y + ya;
	}

	public void paint(Graphics2D g) {
		g.fillOval(x, y, 30, 30);
	}
}