package com.company.CodeForces;

import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/1545/A
public class AquaMoonAndStrangeSort {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] arg) {
        int n = scan.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        while (n > 0) {
            boolean match = false;
            int count = 0;
            for (int i=0;i<n-1;i++) {
                if (nums[i] > nums[i+1]) {
                    int tmp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = tmp;
                    match = true;
                    count++;
                }
                if (match) System.out.println("NO "+i  +" "+(i+1)+ " "+count + " "+ n);
                match=false;
            }
            n--;
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
