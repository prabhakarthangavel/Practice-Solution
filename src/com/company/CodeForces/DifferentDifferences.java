package com.company.CodeForces;

import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/1772/C
public class DifferentDifferences {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scan.nextInt();
        for (int i = 0; i < tests; i++) {
            int k = scan.nextInt();
            int n = scan.nextInt();
            int sum = 1;
            int[] nums = new int[k];
            for (int j=1;j<=k;j++) {
                nums[j-1] = sum;
                if((k-j) > (n-(sum+j))) {
                    for (int m=j;m<=k;m++) {
                        nums[m-1] = m > 1 ? (nums[m-2] + 1) : 1;
                    }
                    break;
                } else {
                    sum += j;
                }
            }
            Arrays.stream(nums).forEach(item -> System.out.printf("%d ", item));
            System.out.println();
        }
    }
}
