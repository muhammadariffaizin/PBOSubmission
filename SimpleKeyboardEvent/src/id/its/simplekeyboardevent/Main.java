package id.its.simplekeyboardevent;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {
	private static final Color BG_COLOR = new Color(26,26,26);
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Simple Keyboard Event");
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setContentPane(new KeyboardPanel(1110, 220));
				frame.getContentPane().setBackground(BG_COLOR);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}