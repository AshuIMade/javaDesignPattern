package com.desgnPatterns.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

public class OldProductFilter {
    //filter by color
    public Stream<Product> filterByColor(List<Product> products,Color color){
        return products.stream().filter(p-> p.color == color);
    }
    //filter by siize was requested one
    public Stream<Product> filterBySize(List<Product> products, Size size){
        return products.stream().filter(p->p.size == size);
    }
    //filter by color and size modification two. not a good ideaa
    public Stream<Product> filterBySizeAndColor(List<Product> products,Size size,Color color){
        return products.stream().filter(p->p.size == size && p.color == color);
    }
}
