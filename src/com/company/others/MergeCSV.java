package com.company.others;

import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergeCSV {
    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scan.next();
        List<String> lines = new ArrayList<>();
        List<String> headers = new ArrayList<>();
        File[] files = new File("D:\\App Folder\\other files").listFiles(obj -> obj.isFile() && obj.getName().endsWith(".csv"));
        for (int i=0;i<files.length;i++) {
            try (BufferedReader bf = new BufferedReader(new FileReader(files[i]))) {
                bf.lines().forEach(line -> {
                    String[] cellValues = line.split(",");
                    if (headers.isEmpty()) headers.addAll(Arrays.stream(cellValues).collect(Collectors.toList()));
                    if (cellValues[2].equalsIgnoreCase(s)) lines.add(line);
                });
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        lines.forEach(System.out::println);

        try(FileWriter outputFile = new FileWriter(new File("D:\\App Folder\\other files\\output.csv"));
            CSVWriter writer = new CSVWriter(outputFile)) {
            writer.writeNext(headers.toArray(new String[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
