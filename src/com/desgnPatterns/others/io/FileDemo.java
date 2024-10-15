package com.desgnPatterns.others.io;

import java.io.File;

public class FileDemo {
    static void pr(String s){
        System.out.println(s);
    }
    public static void demoFiles(){
        File f1 = new File("/java/COPYRIGHT");
        pr("File name: " +f1.getName() );
        pr("Path: " + f1.getPath());
        pr("Abs path: " +f1.getAbsolutePath());
        pr("Parent: "+ f1.getParent());
        pr("exists:?" +f1.exists());
        pr("Is writable: "+ f1.canWrite());
        pr("IS readble: "+ f1.canRead());
        pr("is a directory:? "+f1.isDirectory());
        pr("Is file :?" +f1.isFile());
        pr("is absolute:? "+f1.isAbsolute());
        pr("FIle last MOdified :? "+f1.lastModified());
        pr("File size:"+f1.length()+"Bytes");
    }
    public static void dirList(){
        String dirName = "/temp";
        File f = new File(dirName);
        if(f.isDirectory()){
            pr("dir name: "+dirName);
            String s[] = f.list();
            for (int i =0 ;i <s.length;i++){
                File f2 = new File(dirName + "/"+s[i]);
                if (f2.isDirectory()){
                    pr(s[i]+"f2 is a dir " +f2.getName());
                }else {
                    pr(s[i]+"f2 is a file: "+f2.getName());
                }
            }
        }
        else {
            pr(dirName+ " it is not a directory");
        }
    }
}
