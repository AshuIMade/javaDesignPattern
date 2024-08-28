package com.desgnPatterns.solid.srp;

import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int count= 0;
    public int getCount(){
        return count;
    }
    public void add(String text){
        entries.add("" + (++count)+": " +text);
    }
    public void remove(int index){
        entries.remove(index);
    }
    @Override
    public String toString(){
        return String.join(System.lineSeparator(),entries);
    }
    // first responsibility of the journal class it to take and remove entries
    //in vaiolation of SRP is to add persistance in this class
    //this violates the SRP
    /**
    public void save(String fileName) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(fileName)){
            out.println(toString());
        }
    }
    public void load(String fileName){}
    public void load(URL url){}
     */
}
