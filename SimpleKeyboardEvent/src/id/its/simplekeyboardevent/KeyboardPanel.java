package id.its.simplekeyboardevent;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class KeyboardPanel extends JPanel implements KeyListener {
	private List<Key> keys;
	
	public KeyboardPanel(int width, int height) {
		this.setPreferredSize(new Dimension(width, height));
		this.keys = new ArrayList<Key>();
		
		this.keys.add(new Key(10, 10, 'q'));
		this.keys.add(new Key(120, 10, 'w'));
		this.keys.add(new Key(230, 10, 'e'));
		this.keys.add(new Key(340, 10, 'r'));
		this.keys.add(new Key(450, 10, 't'));
		this.keys.add(new Key(560, 10, 'y'));
		this.keys.add(new Key(670, 10, 'u'));
		this.keys.add(new Key(780, 10, 'i'));
		this.keys.add(new Key(890, 10, 'o'));
		this.keys.add(new Key(1000, 10, 'p'));
		
		this.keys.add(new Key(40, 80, 'a'));
		this.keys.add(new Key(150, 80, 's'));
		this.keys.add(new Key(260, 80, 'd'));
		this.keys.add(new Key(370, 80, 'f'));
		this.keys.add(new Key(480, 80, 'g'));
		this.keys.add(new Key(590, 80, 'h'));
		this.keys.add(new Key(700, 80, 'j'));
		this.keys.add(new Key(810, 80, 'k'));
		this.keys.add(new Key(920, 80, 'l'));
		
		this.keys.add(new Key(90, 150, 'z'));
		this.keys.add(new Key(200, 150, 'x'));
		this.keys.add(new Key(310, 150, 'c'));
		this.keys.add(new Key(420, 150, 'v'));
		this.keys.add(new Key(530, 150, 'b'));
		this.keys.add(new Key(640, 150, 'n'));
		this.keys.add(new Key(750, 150, 'm'));
		
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (Key key : this.keys) {
			key.render(g);
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		//do nothing
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		char key = e.getKeyChar();
		for (Key k : this.keys) {
			if (k.isSymbolMatch(key)) {
				k.setPressed();
				repaint();
			}
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		char key = e.getKeyChar();
		for (Key k : this.keys) {
			if (k.isSymbolMatch(key)) {
				k.setReleased();
				repaint();
			}
		}
	}
}
