package id.its.simplekeyboardevent;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.font.TextAttribute;
import java.text.AttributedString;

public class Key {
	private static final int WIDTH = 100;
	private static final int HEIGHT = 60;
	private static final int RELEASED = 1;
	private static final int PRESSED = 2;
	
	private static final Color CLR_BG = new Color(51,51,51);
	private static final Color CLR_BG_PRESSED = new Color(90,52,27);
	private static final Color CLR_TEXT = Color.WHITE;
	
	private static final Font TEXT_FONT = new Font("SansSerif", Font.PLAIN, 18);
	
	private int x;
	private int y;
	private char symbol;
	private int state;
	
	public Key(int x, int y, char symbol) {
		this.x = x;
		this.y = y;
		this.state = RELEASED;
		this.symbol = symbol;
	}
	
	public void render(Graphics g) {
		if (this.state == RELEASED) {
			g.setColor(CLR_BG);
		} else if (this.state == PRESSED) {
			g.setColor(CLR_BG_PRESSED);
		} else {
			g.setColor(Color.WHITE);
		}
		g.fillRect(this.x, this.y, WIDTH, HEIGHT);
	
		int stringPosX = (int)this.x + (WIDTH / 3);
		int stringPosY = this.y + (HEIGHT / 2);
		
		g.setColor(CLR_TEXT);
		
		AttributedString keyString = new AttributedString(String.valueOf(this.symbol));
		keyString.addAttribute(TextAttribute.FONT, TEXT_FONT);
		g.drawString(keyString.getIterator(), stringPosX, stringPosY);
	}
	
	public boolean isSymbolMatch(char symbol) {
		if (this.symbol == symbol) {
			return true;
		}
		return false;
	}
	
	public void setPressed() {
		this.state = PRESSED;
	}
	
	public void setReleased() {
		this.state = RELEASED;
	}
}
