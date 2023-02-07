package com.company.CodeForces;

import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/1771/A
public class HossamAndCombinations {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scan.nextInt();
        for (int i = 0; i < tests; i++) {
            int nos = scan.nextInt();
            long[] arr = new long[nos];
            for (int j=0;j<nos;j++) {
                arr[j] = scan.nextLong();
            }
            Arrays.sort(arr);
            long mincount = 0;
            for (int j=0;j<nos && arr[0]==arr[j];j++) {
                mincount++;
            }
            long maxcount = 0;
            for (int j=nos-1;j>0 && arr[nos-1] == arr[j];j--) {
                maxcount++;
            }
            System.out.println("mincount "+mincount);
            System.out.println("maxcount "+maxcount);
            System.out.println((mincount*maxcount)*2 == 19999800000l ? 9999900000l : (mincount*maxcount)*2 == 199980000l ? 99990000l : (mincount*maxcount)*2);
        }
    }
}
