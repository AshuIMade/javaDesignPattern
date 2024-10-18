package com.desgnPatterns.others.generics;

public class FourD extends ThreeD{
    protected int t;
    private final String name = "Four Dimenational";

    public FourD(int x, int y,int z,int t) {
        super(x, y,z);
        this.t = t;
    }

    @Override
    public void showDim(){
        System.out.println(name);
    }
}
