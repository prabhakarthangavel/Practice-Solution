package com.company.CodeForces;

import java.util.Scanner;

//https://codeforces.com/problemsets/acmsguru/problem/99999/460
public class PluralNouns {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scan.nextInt();
        for (int l = 0; l < q; l++) {
            String str = scan.next();

            if (str.substring(str.length()-2).equalsIgnoreCase("ch") || str.charAt(str.length()-1) == 'x' || str.charAt(str.length()-1) == 's' || str.charAt(str.length()-1) == 'o') {
                System.out.println(str + "es");
            }else if (str.substring(str.length()-2).equalsIgnoreCase("fe")) {
                System.out.println(str.substring(0, str.length()-2) + "ves");
            } else if (str.charAt(str.length()-1) == 'f') {
                System.out.println(str.substring(0, str.length()-1) + "ves");
            }else if (str.charAt(str.length()-1) == 'y') {
                System.out.println(str.substring(0, str.length()-1) + "ies");
            }else {
                System.out.println(str + "s");
            }
        }
    }
}
