package com.company.Hackerrank;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

//https://www.hackerrank.com/challenges/lilys-homework/problem
public class LillysHomework {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] arg) {
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] assend = new int[arr.length];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            assend[i] = arr[i];
        }

        Arrays.sort(assend);
        Map<Integer, Integer> assendMap = new HashMap<>();
        for (int i=0;i<assend.length;i++) {
            assendMap.put(assend[i], Math.abs(Arrays.binarySearch(arr, assend[i])));
        }

        int[] desend = new int[arr.length];
        int count = 0;
        Map<Integer, Integer> desendMap = new HashMap<>(assendMap);
        for (int i=arr.length-1;i>=0;i--) {
            desend[count] = assend[i];
            count++;
        }

        AtomicInteger index = new AtomicInteger();
        assendMap.entrySet().stream().forEach(map -> {
            int arrVal = Arrays.binarySearch(arr, map.getKey());
            int assendVal = index.get();
            if (arrVal != assendVal) {

                map.setValue(assendVal);
                int swapKey = Arrays.binarySearch(arr, assendVal);
                
            }
            index.getAndIncrement();
        });
    }
}
