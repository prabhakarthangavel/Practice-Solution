//package com.company.CodeForces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1626/B
public class MinorReduction {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            Long no = scan.nextLong();
            String s = no.toString();
            int[] arr = new int[2];
            int insideMax = 0;
            int outsidemax = 0;
            if (s.length() == 3) {
                int max1 = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(1));
                insideMax = Integer.parseInt(max1 + s.substring(2));
            }

            for (int j = 0; j < s.length() - 1; j++) {
                int addValue = Character.getNumericValue(s.charAt(j)) + Character.getNumericValue(s.charAt(j + 1));
                if (addValue > outsidemax) {
                    outsidemax = addValue;
                    arr[0] = j;
                    arr[1] = j + 1;
                }
                if (outsidemax == 18) break;

            }
//            System.out.println(arr[0]);
//            System.out.println("s.substring(0, arr[0])"+s.substring(0, arr[0]));
//            System.out.println("s.substring(s.length())"+s.substring(s.length()));
            String maxString = s.substring(0, arr[0]) + outsidemax;
            if (arr[1] != s.length() - 1) maxString = maxString + s.substring(s.length() - 1);
            outsidemax = Integer.parseInt(maxString);
            System.out.println(insideMax > outsidemax ? insideMax : outsidemax);
        }
    }
}
