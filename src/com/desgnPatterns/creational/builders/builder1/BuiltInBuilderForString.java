package com.desgnPatterns.creational.builders.builder1;

public class BuiltInBuilderForString {
    public static void withOutStringBuilder(){
        String[] words = {"hello","world"};
        //if we wnt to disply in html list
        //wht we hve to do is
        System.out.println("<ul>");
        System.out.println("<li>"+words[0]+"</li>");
        System.out.println("<li>"+words[1]+"</li>");
        System.out.println("</ul>");
        //this implementtion is bad b/c it hs to mny hrd coded things
    }
    public static void demoBUiltinStingBUilder(){
        String[] words = {"Hello","World"};
        StringBuilder builder = new StringBuilder();
        builder.append("<ul>\n");
        for (String word :words){
            builder.append(String.format("  <li>%s</li>\n",word));
        }
        builder.append("</ul>\n");
        System.out.println(builder);
    }
}
