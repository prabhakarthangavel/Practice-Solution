package com.company.Algorithms;

import java.util.*;

//https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435762#overview
public class BubbleSort {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the no. of items to sort: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter items: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        //bubble sort logic
        while (n > 0) {
            for (int i = 0; i < n-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
            n--;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }

}
