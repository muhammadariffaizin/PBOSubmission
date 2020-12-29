package id.its.simpleactionevent;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			 public void run() {
				 JFrame frame = new JFrame("Simple Action Event");
				 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 frame.setContentPane(new UIPanel(640, 480));
				 frame.pack();
				 frame.setVisible(true);
			 }
		 });

	}

}
