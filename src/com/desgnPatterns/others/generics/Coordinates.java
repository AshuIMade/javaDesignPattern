package com.desgnPatterns.others.generics;

public class Coordinates<T extends TwoD> {

    public T[] t;

    public Coordinates(T[] t){
        this.t = t;
    }

    public void showXY(){}
}
