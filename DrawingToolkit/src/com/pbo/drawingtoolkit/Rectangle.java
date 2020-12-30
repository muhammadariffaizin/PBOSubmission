package com.pbo.drawingtoolkit;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends DrawingObjectBounds {
    private int rectWidth, rectHeight;

    public Rectangle() {
        super();
    }
    
    public Rectangle(int x1, int y1, int x2, int y2, Color color, boolean fill) {
        super(x1, y1, x2, y2, color, fill);
    }
    
    @Override 
    public void draw(Graphics g) {
        rectWidth = getWidth();
        rectHeight = getHeight();
        g.drawRect(getUpperLeftX(), getUpperLeftY(), rectWidth, rectHeight);
    }
}
