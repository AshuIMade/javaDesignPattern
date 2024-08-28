package com.desgnPatterns.solid.srp;

import java.io.*;
import java.net.URL;

public class Persistence {
    public void save(Journal journal,String fileName,boolean overWrite) throws FileNotFoundException {
        if(overWrite || new File(fileName).exists()){
            try (PrintStream printStream = new PrintStream(fileName)) {
                printStream.println(journal.toString());
            }
        }
    }
    //This doesn't work correctly
    public Journal load(String fileName){
        Journal journal =new Journal();
        if(new File(fileName).exists()){
            try (FileReader fileReader = new FileReader(fileName)){
                String read= fileReader.getEncoding().toString();
                 journal.add(read);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return journal;
    }
    public Journal load(URL url){
        return null;
    }
}
