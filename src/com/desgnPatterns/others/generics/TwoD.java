package com.desgnPatterns.others.generics;

public class TwoD {

    protected int x,y;
    private final String name = "Two dimensional";

    public TwoD(int x,int y){
        this.x = x;
        this.y =y;
    }
    public void showDim(){
        System.out.println(name);
    }

}
