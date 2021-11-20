package com.company.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] arg) {
        System.out.println("Enter no. of elements");
        int n = scan.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        for (int i=1;i<n;i++) {
            int index = i;
            while (index > 0) {
                if (nums[index] > nums[index-1]) {
                    int tmp = nums[index];
                    nums[index] = nums[index-1];
                    nums[index-1] = tmp;
                }
                index--;
            }
        }

        Arrays.stream(nums).forEach(System.out::println);
    }
}
