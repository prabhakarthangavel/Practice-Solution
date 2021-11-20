package com.company.CodeForces;

import java.util.Scanner;

public class CombinatoricsHomework {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int count = 0;
            int a = scan.nextInt();
            if (a > 1) count++;
            int b = scan.nextInt();
            if (b > 1) count++;
            int c = scan.nextInt();
            if (c > 1) count++;
            int m = scan.nextInt();

            if (count == m ) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
