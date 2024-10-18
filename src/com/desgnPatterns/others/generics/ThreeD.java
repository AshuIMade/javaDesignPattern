package com.desgnPatterns.others.generics;

public class ThreeD extends TwoD {
    protected int z;

    private final String name = "three dimentional";

    public ThreeD(int x, int y,int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void showDim(){
        System.out.println(name);
    }
}
