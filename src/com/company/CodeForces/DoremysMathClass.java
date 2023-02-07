package com.company.CodeForces;

import java.util.*;

//https://codeforces.com/problemset/problem/1764/B
public class DoremysMathClass {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scan.nextInt();
        for (int i=0;i<tests;i++) {
            int totalNos = scan.nextInt();
            int[] nosArray = new int[totalNos];
            for (int j = 0;j<totalNos;j++) {
                nosArray[i]= scan.nextInt();
            }
            System.out.println(getMaximumLength(nosArray));
        }
    }

    static int __gcd(int a, int b)
    {
        return b == 0? a:__gcd(b, a % b);
    }

    // recursive implementation
    static int GcdOfArray(int[] arr, int idx)
    {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int a = arr[idx];
        int b = GcdOfArray(arr, idx + 1);
        return __gcd(
                a, b); // __gcd(a,b) is inbuilt library function
    }

    static int getMaximumLength(int[] nosArray) {
//        for (int i=1;i<list.size();i++) {
//            for (int j=0;j<list.size();j++) {
//                int diff = list.get(i) - list.get(j);
//                if (diff > 0 && !list.contains(diff)) {
//                    list.add(diff);
//                    i = 1;
//                }
//            }
//        }
//        return list.size();
        System.out.println("GCD "+ GcdOfArray(nosArray, 0));
        return Arrays.stream(nosArray).max().getAsInt() / GcdOfArray(nosArray, 0);
    }
}
