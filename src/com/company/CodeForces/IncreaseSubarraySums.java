package com.company.CodeForces;

import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/1644/C
public class IncreaseSubarraySums {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scan.nextInt();
        for (int i = 0; i < tests; i++) {
            int num = scan.nextInt();
            int[] numArr = new int[num];
            int incrementInt = scan.nextInt();
            for (int j = 0; j < num; j++) {
                numArr[j] = scan.nextInt();
            }
            for (int k=1;k<=num;k++) {
                System.out.println(getMaximum(numArr, k, incrementInt));
            }
        }
    }

    static int getMaximum(int[] numbers, int loop, int increment) {
        int resultSumm = 0;
        boolean dobreak = false;
        for (int i = 0; i < numbers.length && !dobreak; i++) {
            int localSum = 0;
            for (int j=i;j<(i+loop)&& j< numbers.length && !dobreak;j++) {
                localSum = localSum + (numbers[j] + increment);
//                System.out.print(numbers[j] +increment + " "+ localSum);
                resultSumm = localSum > resultSumm ? localSum : resultSumm;
                if (j == (numbers.length-1)) {
                    dobreak = true;
                }
            }
//            System.out.println("**");
        }
        return resultSumm;
    }
}
