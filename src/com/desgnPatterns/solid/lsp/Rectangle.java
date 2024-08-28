package com.desgnPatterns.solid.lsp;

public class Rectangle {
    protected int width;
    protected int height;
    public Rectangle(){}
    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea(){
        return height*width;
    }
    //you dont need  a square class
    public boolean isSquare(){
        return width == height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
