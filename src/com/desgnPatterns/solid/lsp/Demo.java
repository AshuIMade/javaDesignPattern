package com.desgnPatterns.solid.lsp;

public class Demo {
    public static void useIt(Rectangle r){
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected Area is: " + width * 10 +
                " but we get: " +r.getArea());
    }
}
