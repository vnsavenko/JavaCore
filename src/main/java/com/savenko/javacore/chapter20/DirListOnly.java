package com.savenko.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/Projects/JavaCore";
        File f1 = new File(dirname);
        FilenameFilter only = (dir, name)->name.endsWith(".txt");
        String[] s = f1.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
