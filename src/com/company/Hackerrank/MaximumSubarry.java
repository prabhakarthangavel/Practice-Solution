package com.company.Hackerrank;

import java.util.*;

//https://www.hackerrank.com/challenges/maxsubarray/problem?isFullScreen=false
public class MaximumSubarry {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scan.nextInt();
        for (int j=0;j<q;j++){
            int n = scan.nextInt();
            int[] arr = new int[n];
            long positiveSum = 0;
            List<Integer> negative = new ArrayList<>();
            for (int k=0;k<n;k++) {
                arr[k] = scan.nextInt();
                if (arr[k] > 0) {
                    positiveSum += arr[k];
                }else {
                    negative.add(arr[k]);
                }
            }

            Collections.sort(negative);

            long result1 = 0;
            long result2 = 0;
            if (!negative.isEmpty()) {
                result1 = (positiveSum + negative.get(negative.size()-1));
            }else {
                result1 = positiveSum;
            }
            if (positiveSum > 0) {
                result2 = positiveSum;
            }else {
                result2 = (negative.get(negative.size()-1));
            }
            result1 = (result1 < 0 && result2 !=0)  ? result2 : result1;
            System.out.println(result1 + " " + result2);
        }
    }
}
