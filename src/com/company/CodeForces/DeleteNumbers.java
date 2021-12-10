package com.company.CodeForces;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeleteNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader deleteFile = new BufferedReader(new FileReader("D:\\App Folder\\Delete.txt"));
        List<String> deleteData = new ArrayList<>();
        deleteFile.lines().forEach(item -> deleteData.add(item));

        BufferedReader saveFile = new BufferedReader(new FileReader("D:\\App Folder\\Save.txt"));
        PrintWriter output = new PrintWriter("D:\\App Folder\\Output.txt");
        saveFile.lines().forEach(item -> {
            if (!deleteData.contains(item)) {
                output.println(item);
            }
        });
        output.close();
    }
}
