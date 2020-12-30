package com.pbo.drawingtoolkit;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends DrawingObjectBounds {
    private int squareWidth, squareHeight;

    public Square() {
        super();
    }
    
    public Square(int x1, int y1, int x2, int y2, Color color, boolean fill) {
        super(x1, y1, x2, y2, color, fill);
    }
    
    @Override 
    public void draw(Graphics g) {
        squareWidth = getWidth();
        squareHeight = getHeight();
        squareWidth = squareHeight;
        g.drawRect(getUpperLeftX(), getUpperLeftY(), squareWidth, squareHeight);
    }
}
