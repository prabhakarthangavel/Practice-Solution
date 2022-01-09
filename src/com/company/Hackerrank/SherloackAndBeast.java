package com.company.Hackerrank;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/sherlock-and-the-beast/problem
public class SherloackAndBeast {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int n = scan.nextInt();
            if (n % 3 == 0) {
                System.out.println(strGenerate(n, "5"));
            } else if (n < 3) {
                System.out.println(-1);
            } else {
//                for (int j=0;j<n;j++) {
//                    if (j%)
//                }
            }
        }
    }

    public static StringBuilder strGenerate(int n, String s) {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            str.append(s);
        }
        return str;
    }
}

