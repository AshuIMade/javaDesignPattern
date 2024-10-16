package com.desgnPatterns.others.generics;

public class GenClass<T> {
    private T t;
    public GenClass(T t){
        this.t = t;
    }
    public void setT(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }
    public void showType(){
        System.out.println("Type of t is "+ t.getClass().getName());
    }
}
