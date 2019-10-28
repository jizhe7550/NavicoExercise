package com.jizhe7550.navicoexercise.exercise2;

public class Color {
    
    public static Color BLACK = new Color(0, 0, 0);
    public static Color WHITE = new Color(255, 255, 255);
    public static Color GRAY = new Color(127, 127, 127);
    
    public int red;
    public int green;
    public int blue;
    
    public Color(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }
    
    public int getRed() {
        return red;
    }
    
    public void setRed(int red) {
        this.red = red;
    }
    
    public int getGreen() {
        return green;
    }
    
    public void setGreen(int green) {
        this.green = green;
    }
    
    public int getBlue() {
        return blue;
    }
    
    public void setBlue(int blue) {
        this.blue = blue;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Color) {
            return red == ((Color) obj).getRed() && green == ((Color) obj).getGreen() && blue == ((Color) obj).getBlue();
        }
        return false;
    }
    
    public int getHashCode() {
        return red * 16 + green * 8 + blue;
    }
    
    
    public String toString() {
        return "(R, G, B): (" + red + ", " + green + ", " + blue + ")";
    }
    
}
