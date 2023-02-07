package com.company.CodeForces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1772/B
public class MatrixRotation {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scan.nextInt();
        for (int i = 0; i < tests; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            if (a < b && c < d && a < c && b < d) {
                System.out.println("YES");
            }else if (c < a && d < b && c < d && a < b) {
                System.out.println("YES");
            }else if (d < c && b < a && d < b && c < a) {
                System.out.println("YES");
            }else if (b < d && a < c && b < a && d < c) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
