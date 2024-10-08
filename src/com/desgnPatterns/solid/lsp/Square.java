package com.desgnPatterns.solid.lsp;

public class Square extends Rectangle {
    public Square(){}
    public Square(int side){
        height = width = side;
    }
    @Override
    public void setWidth(int width){
        super.setWidth(width);
        super.setHeight(width);
    }
    @Override
    public void setHeight(int height){
        super.setHeight(height);
        super.setWidth(height);
    }

}
