package com.bounceball;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class BallPanel extends JPanel {
	private static final int REFRESH_RATE = 30;
	private Ball ball;
	private BallArea box;
	private int areaWidth;
	private int areaHeight;
	
	public BallPanel(final int width, final int height) {
		this.areaWidth = width;
		this.areaHeight = height;
		this.setPreferredSize(new Dimension(areaWidth, areaHeight));
		Random rand = new Random();
		int radius = 50;
		int x = rand.nextInt(width - radius * 2 - 20) + radius + 10;
		int y = rand.nextInt(height - radius * 2 - 20) + radius + 10;
		int speed = 50;
		int angleInDegree = rand.nextInt(360);
		
		ball = new Ball(x, y, radius, speed, angleInDegree, Color.BLUE);
		box = new BallArea(0, 0, width, height, Color.BLACK, Color.WHITE);
		
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				Component c = (Component)e.getSource();
				Dimension dim = c.getSize();
				areaWidth = dim.width;
				areaHeight = dim.height;
				System.out.println(areaWidth + areaHeight);
				box.set(0, 0, areaWidth, areaHeight);
			}
		});
		startThread();
	}
	
	public void startThread() {
		Thread gameThread = new Thread() {
			public void run() {
				while(true) {
					ball.collide(box);
					repaint();
					try {
						Thread.sleep(1000/REFRESH_RATE);
					} catch (InterruptedException ex) {
						System.out.println(ex.getMessage());
					}
				}
			}
		};
		gameThread.start();
	}
	
	@Override 
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		box.draw(g);
		ball.draw(g);
	}
}
