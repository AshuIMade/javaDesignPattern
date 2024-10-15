package com.desgnPatterns.others.io;

import java.io.BufferedInputStream;
import java.io.IOException;

public class InputOutputStreamDemo {
    public static void demoIOStream() throws IOException {
        char c = '\0';
        BufferedInputStream br = new BufferedInputStream(System.in);
        System.out.println("Input char first to Quite");
        do{
            c = (char) br.read();
            System.out.println("you enter char :" + c);
        }while (c != 'q');
        System.out.println("we are quting");
    }
}
