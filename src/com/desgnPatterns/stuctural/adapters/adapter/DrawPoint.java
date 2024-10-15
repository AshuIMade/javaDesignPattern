package com.desgnPatterns.stuctural.adapters.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrawPoint {
    private final static List<VectorObject> vectorobjects=
            new ArrayList<>(Arrays.asList(
                    new VectorRectangle(1,1,10,10),
                    new VectorRectangle(3,3,6,6))
            );

    //this is the interface given
    public static void drawPoint(Point point){
        System.out.println(".");
    }
    public static void drawLine(){
        for(VectorObject vo:vectorobjects){
            for (Line line:vo){
                LineToPointAdapter lineToPointAdapter = new LineToPointAdapter(line);
                lineToPointAdapter.forEach(DrawPoint::drawPoint);
            }
        }
    }
}
