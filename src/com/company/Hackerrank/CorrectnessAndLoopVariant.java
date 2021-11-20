package com.company.Hackerrank;

import java.util.Scanner;

public class CorrectnessAndLoopVariant {

    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];   // value = 4
            int j = i - 1;      // j = 0
            while(j >= 0 && A[j] > value){ // a[j] = 7
                A[j + 1] = A[j];
                System.out.println("A[j+1] "+ A[j+1]);
                j = j - 1;
                System.out.println("j "+j);
            }
            A[j + 1] = value;
        }

        printArray(A);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i=0;i<n;i++) {
            ar[i] = scan.nextInt();
        }

        insertionSort(ar);
    }
}
