package com.company.CodeForces;

import java.util.Scanner;

public class AddPlusMinus {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scan.nextInt();
        for (int i = 0; i < tests; i++) {
            int length = scan.nextInt();
            String str = scan.next();
            int sum = 0;
            StringBuilder resultString = new StringBuilder();
            for (int j=0;j<str.length();j++) {
                sum += Character.getNumericValue(str.charAt(j));
                if (j > 0) {
                    if (sum > 1) {
                        resultString.append("-");
                        sum = 0;
                    }else {
                        resultString.append("+");
                    }
                }
            }
            System.out.println(resultString);
        }
    }
}
