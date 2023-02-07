package com.company.Hackerrank;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/restaurant/problem?utm_campaign=challenge-recommendation
public class Restaurant {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int l = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(resturant(l,b));
        }
    }

    public static int resturant(int l, int b) {
        if (l == b) {
            return 1;
        }
        for (int j = 2; j < 10; j++) {
            if (l % j == 0 && b % j == 0) {
                return (l * b) / (j * j);
            }
        }
        return (l * b);
    }
}
