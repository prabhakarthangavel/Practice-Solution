package com.company.CodeForces;

import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/1566/D1
public class SeatingArrangements {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] ppls = new int[m];
            for (int j = 0; j < m; j++) {
                ppls[j] = scan.nextInt();
            }
            int count = 0;
            for (int k = 1; k < m; k++) {
                for (int j = 0; j < k; j++) {
                    if (ppls[j] < ppls[k]) count++;
                }
            }
            System.out.println(count);
        }
    }
}
