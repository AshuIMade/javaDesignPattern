package com.desgnPatterns.others.generics;

public class GenTwo<T,V> {

    private T t;
    private V v;

    public GenTwo(T t,V v){
        this.t = t;
        this.v = v;
    }

    public T getT(){
        return t;
    }
    public V getV(){
        return v;
    }

    public void showTypes(){
        System.out.println("The Types of the Generics T: "+
                t.getClass().getName()+"The Type of V: "+
                v.getClass().getName());
    }

}
