package com.jizhe7550.navicoexercise.exercise2;

public class Chart {
    
    public Point topLeft;
    public Point bottomRight;
    public Color bgColor;
    
    public Chart(int x1, int y1, int x2, int y2) {
        this.topLeft = new Point(x1, y1);
        this.bottomRight = new Point(x2, y2);
    }
    
    public Chart(int x1, int y1, int x2, int y2, Color color)
    {
        this.topLeft = new Point(x1, y1);
        this.bottomRight = new Point(x2, y2);
        this.bgColor = color;
    }
    
}
