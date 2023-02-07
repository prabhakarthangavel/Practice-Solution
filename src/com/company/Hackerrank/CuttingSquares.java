package com.company.Hackerrank;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/p1-paper-cutting/problem
public class CuttingSquares {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int row = scan.nextInt();
        int column = scan.nextInt();
        System.out.println(CuttingSquares.solve(row, column));
    }

    public static long solve(long n, long m) {
        return (n*m)-1;
    }
}
