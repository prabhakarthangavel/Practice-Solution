package com.company.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

//https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435768#overview
public class SelectionSort {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] arg) {
        System.out.println("Enter no. of elements");
        int n = scan.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        while (n > 0) {
            n--;
            int largeIndex = 0;
            for (int i = 1; i <= n; i++) {
                if (nums[i] > nums[largeIndex]) {
                    largeIndex = i;
                }
            }
            int tmp = nums[n];
            nums[n] = nums[largeIndex];
            nums[largeIndex] = tmp;
        }

        Arrays.stream(nums).forEach(System.out::println);
    }
}
