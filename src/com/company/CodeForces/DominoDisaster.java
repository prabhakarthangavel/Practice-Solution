package com.company.CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://codeforces.com/contest/1567/problem/A
public class DominoDisaster {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int size = scan.nextInt();
            list.add(scan.next());
        }

        for (String str : list) {
            int uIndex = str.indexOf("U");
            int dIndex = str.indexOf("D");
            if (uIndex > -1 || dIndex > -1) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'U') {
                        str = str.substring(0, i) + "D" + str.substring(i + 1);
                    } else if (str.charAt(i) == 'D') {
                        str = str.substring(0, i) + "U" + str.substring(i + 1);
                    }
                }
            }
            System.out.println(str);
        }
    }
}
