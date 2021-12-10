package com.company.CodeForces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

//https://codeforces.com/problemset/problem/1598/C
public class DeleteTwoElements {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] arg) {
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int n = scan.nextInt();
            Double[] arr = new Double[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scan.nextDouble();
            }
            AtomicReference<Double> arrSum = new AtomicReference<>(0.0);
            Arrays.stream(arr).forEach(value -> {
                arrSum.updateAndGet(v -> v + value);
            });

            int count = 0;
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    if (k != l && k > l) {
                        Double[] tmpArr = Arrays.copyOf(arr, n);
                        tmpArr[k] = 0.0;
                        tmpArr[l] = 0.0;
                        AtomicReference<Double> tmpSum = new AtomicReference<>(0.0);
                        Arrays.stream(tmpArr).forEach(value -> {
                            tmpSum.updateAndGet(v -> v + value);
                        });
                        if (tmpSum.get()/(n-2) - arrSum.get()/(n) == 0.0) count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
