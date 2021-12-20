package com.company.Hackerrank;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/anagram/problem
public class Anagram {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scan.nextInt();
        for (int j=0;j<q;j++) {
            String s = scan.next();
            int count = 0;
            if (s.length()%2 != 0) {
                System.out.println(-1);
            }else {
                String s1 = s.substring(0, s.length()/2);
                StringBuilder s2 = new StringBuilder(s.substring(s.length()/2));
                System.out.println(s1+ " "+s2);
                for (int i=0;i<s1.length();i++) {
                    int index = s2.indexOf(Character.toString(s1.charAt(i)));
                    if (index >= 0) {
                        s2.deleteCharAt(index);
                    }else {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
