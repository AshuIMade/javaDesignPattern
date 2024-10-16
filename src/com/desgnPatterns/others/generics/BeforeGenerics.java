package com.desgnPatterns.others.generics;

public class BeforeGenerics {
    private Object object;
    public BeforeGenerics(Object object){
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
    public void setObject(Object object){
        this.object = object;
    }
    public void showType(){
        System.out.println("The type of the Objject is "+object.getClass().getName());
    }
}
