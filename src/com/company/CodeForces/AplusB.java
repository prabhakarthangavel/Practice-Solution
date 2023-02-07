package com.company.CodeForces;

import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/1772/A
public class AplusB {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scan.nextInt();
        for (int i = 0; i < tests; i++) {
            String expr = scan.next();
            String[] exprArray = expr.split("\\+");
            System.out.println(Integer.parseInt(exprArray[0]) + Integer.parseInt(exprArray[1]));
        }
    }
}
