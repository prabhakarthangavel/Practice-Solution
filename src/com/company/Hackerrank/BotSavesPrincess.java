package com.company.Hackerrank;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/saveprincess/problem
public class BotSavesPrincess {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] arg) {
        int n = scan.nextInt();
        String[] path = new String[n];
        int botIndex = -1;
        int princeIndex = -1;
        for (int i = 0; i < n; i++) {
            path[i] = scan.next();
            if (botIndex == -1 && path[i].contains("m")) botIndex = i;
            if (princeIndex == -1 && path[i].contains("p")) princeIndex = i;
        }

        int height = botIndex - princeIndex;
        String heightString = height > 0 ? "UP" : "DOWN";
        for (int i = 0; i < Math.abs(height); i++) {
            System.out.println(heightString);
        }

        int width = path[botIndex].indexOf('m') - path[princeIndex].indexOf('p');
        String widthString = width > 0 ? "LEFT" : "RIGHT";
        for (int i = 0; i < Math.abs(width); i++) {
            System.out.println(widthString);
        }
    }
}
