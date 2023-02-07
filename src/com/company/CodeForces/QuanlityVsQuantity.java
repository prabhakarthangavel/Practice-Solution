package com.company.CodeForces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

//https://codeforces.com/problemset/problem/1646/B
public class QuanlityVsQuantity {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            int n = scan.nextInt();
            int[] num = new int[n];
            for (int j = 0; j < n; j++) {
                num[j] = scan.nextInt();
            }
            System.out.println(isQualityQuantity(num));
        }
    }

    public static String isQualityQuantity(int[] num) {
        Arrays.sort(num);
        if (num.length >= 3 && num[num.length - 1] > (num[0] + num[2])) return "YES";

        int mid = (num.length / 2) ;
        int i = 1;
        while (i <= mid) {
            AtomicLong smallSum = new AtomicLong();
            Arrays.stream(Arrays.copyOfRange(num, 0, i+1)).forEach(value -> {
                smallSum.addAndGet(value);
            });
            AtomicLong largeSum = new AtomicLong();
            Arrays.stream(Arrays.copyOfRange(num, mid+1, mid+(i+1))).forEach(value -> {
                largeSum.addAndGet(value);
            });
            if (smallSum.get() < largeSum.get()) return "YES";
            i++;
        }
        return "NO";
    }
}
