package com.company.CodeForces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/617/A
public class Elephant {

    public static final Scanner scan = new Scanner(System.in);
    public static int steps = 0;
    public static void main(String[] args) {
        int n = scan.nextInt();
        if (n> 10) {
            int mod = n%10;
            steps += (n-n%10)/5;
            if (mod > 0) count(mod);
        }else {
            count(n);
        }
        System.out.println(steps);
    }

    static void count(int n) {
        if (n == 1 || n == 2 || n == 3 || n == 4 || n == 5) {
            steps++;
        } else {
            steps += 2;
        }
    }
}
