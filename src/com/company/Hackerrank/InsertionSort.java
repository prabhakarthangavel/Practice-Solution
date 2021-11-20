package com.company.Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] arg) {
        int n = scan.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }
        insertionSort1(n, arr);
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        for (int i = 1; i < n; i++) {
            int index = i;
            while (index > 0) {
                if (arr.get(index) < arr.get(index-1)) {
                    Integer tmp = arr.get(index);
                    arr.set(index, arr.get(index -1));
                    arr.set(index-1, tmp);
                }
                index--;
            }
            for (Integer integer : arr) {
                System.out.print(integer+"\t");
            }
            System.out.println();
        }
    }
}
