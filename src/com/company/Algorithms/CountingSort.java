package com.company.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

//https://www.youtube.com/watch?v=pEJiGC-ObQE
public class CountingSort {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = new int[n];
        int k = 0; //max value
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > k) k = arr[i];
        }

        int[] count = new int[k+1]; //store no. of occurance based on max key value
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= k; i++) {
            count[i] = count[i] + count[i-1]; //store the no. occurance adding previous index value
        }

        int[] result = new int[n];
        for (int i=n-1;i>=0;i--) {
            result[--count[arr[i]]] = arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
