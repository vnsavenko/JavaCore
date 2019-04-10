package com.savenko.javacore.chapter20;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String s = reader1.readLine();

        if (args[0].equals("-c")){
            BufferedReader reader = new BufferedReader(new FileReader(s));

            int id;
            int max = 0;
            while (reader.ready()){
                id = Integer.parseInt(reader.readLine().substring(0,8).trim());
                if (id > max) max = id;
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(s, true));
            writer.newLine();
            writer.write(String.format("%-8d%-30.30s%-8.8s%-4.4s",max+1,args[1],args[2],args[3]));

            writer.close();
            reader.close();
            reader1.close();

        }else {

            reader1.close();

        }

    }
}
