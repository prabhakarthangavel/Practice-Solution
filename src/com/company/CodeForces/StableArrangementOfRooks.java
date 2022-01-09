package com.company.CodeForces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1621/A
public class StableArrangementOfRooks {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scan.nextInt();
        for (int j = 0; j < q; j++) {
            int size = scan.nextInt();
            int rooks = scan.nextInt();
            if (((rooks * 2) - 1) > size) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < size; i++) {
                    for (int k = 0; k < size; k++) {
                        if (i%2 == 0 && i == k && rooks > 0) {
                            System.out.print("R");
                            rooks--;
                        }else {
                            System.out.print(".");
                        }
                    }
                    System.out.println("");
                }
            }
        }
    }
}
