package com.company.CodeForces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1791/C
public class PrepandAndAppend {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scan.nextInt();
        for (int i = 0; i < tests; i++) {
            int length = scan.nextInt();
            String binary = scan.next();
            System.out.println(getMinLength(binary));
        }
    }

    static int getMinLength(String binary) {
        if (binary.length() >= 2) {
            if (binary.charAt(0) != binary.charAt(binary.length() - 1)) {
                if (binary.length() >= 4) {
                    return getMinLength(binary.substring(1, binary.length() - 1));
                }else {
                    return binary.length()-2;
                }
            }
        }
        return binary.length();
    }

}
