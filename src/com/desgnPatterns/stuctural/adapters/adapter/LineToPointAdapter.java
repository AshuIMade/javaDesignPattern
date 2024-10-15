package com.desgnPatterns.stuctural.adapters.adapter;

import java.util.ArrayList;

public class LineToPointAdapter extends ArrayList<Point> {
    private static int count = 0;
    public LineToPointAdapter(Line line){
        System.out.println(
                String.format("[%d]: Generating Points for line [%d,%d]-[%d,%d]. " +
                                "no caching",
                        ++count,line.start.x,line.start.y,line.end.x,line.end.y)
        );
        for (int i = 1;i<5;i++){
            add(new Point(line.start.x,line.start.y+i));
            add(new Point(line.end.x-i,line.end.y-i));
        }


    }
}
