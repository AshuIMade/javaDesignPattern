package com.desgnPatterns.solid.isp;

public class ModernMachine implements IPrintInterface{
    @Override
    public void print(Document document) {
        System.out.println("printing with out scanning");
    }
}
