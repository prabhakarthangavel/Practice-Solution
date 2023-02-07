package com.company.CodeForces;

import java.math.BigDecimal;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/677/A
public class VanyaAndFence {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int friends = scan.nextInt();
        double maxHeight = scan.nextDouble();
        int minWidth = 0;
        for (int i = 0; i < friends; i++) {
            double friendHeight = scan.nextDouble();
            minWidth += friendHeight > maxHeight ? Math.ceil(friendHeight/maxHeight) : 1;
        }
        System.out.println(minWidth);
    }
}
