package com.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BouncingBallSimple extends JPanel {
	private static final int AREA_WIDTH = 640;
	private static final int AREA_HEIGHT = 480;
	
	private static final int BALL_X_INITIAL_POSITION = 50;
	private static final int BALL_Y_INITIAL_POSITION = 20;
	
	private double ballRadius = 50;
	
	private double ballX = ballRadius + BALL_X_INITIAL_POSITION;
	private double ballY = ballRadius + BALL_Y_INITIAL_POSITION;
	
	private float ballSpeedX = 4;
	private float ballSpeedY = 3;
	
	private static final int REFRESH_RATE = 30;
	
	public BouncingBallSimple() {
		this.setPreferredSize(new Dimension(AREA_WIDTH, AREA_HEIGHT));
		
		Thread gameThread = new Thread() {
			public void run() {
				while(true) {
					ballX += ballSpeedX;
					ballY += ballSpeedY;
					
					if(ballX - ballRadius < 0) {
						ballSpeedX = -ballSpeedX;
						ballX = ballRadius;
					} else if(ballX + ballRadius > AREA_WIDTH) {
						ballSpeedX = -ballSpeedX;
						ballX = AREA_WIDTH - ballRadius;
					}
					
					if(ballY - ballRadius < 0) {
						ballSpeedY = -ballSpeedY;
						ballY = ballRadius;
					} else if(ballY + ballRadius > AREA_HEIGHT) {
						ballSpeedY = -ballSpeedY;
						ballY = AREA_HEIGHT - ballRadius;
					}
					
					repaint();
					
					try {
						Thread.sleep(1000 / REFRESH_RATE);
					} catch (InterruptedException ex) {
					}
				}
			}
		};
		gameThread.start();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame("Simple Bouncing Ball");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setContentPane(new BouncingBallSimple());
				frame.pack();
				frame.setVisible(true);
			}
		}); 
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, AREA_WIDTH, AREA_HEIGHT);
		
		g.setColor(Color.RED);
		g.fillOval((int)(ballX - ballRadius), (int)(ballY - ballRadius), (int)(2 * ballRadius), (int)(2 * ballRadius));
	}
}
