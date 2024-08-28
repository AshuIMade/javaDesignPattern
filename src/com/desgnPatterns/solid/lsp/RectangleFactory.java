package com.desgnPatterns.solid.lsp;

public class RectangleFactory {
    public static Rectangle rectangleFactory(int width, int height){
        return new Rectangle(width,height);
    }
    public static Rectangle squareFactory(int side){
        return new Rectangle(side,side);
    }
}
