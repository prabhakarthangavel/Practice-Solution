package com.company.Hackerrank;

import java.util.*;
import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/funny-string/problem
public class FunnyString {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] arg) {
        int n = scan.nextInt();

        for (int i=0;i<n;i++) {
            String s = scan.next();
            System.out.println(funnyString(s));
        }
    }

    public static String funnyString(String s) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int j=0;j<s.length();j++) {
            Integer in = Integer.valueOf(s.charAt(j));
            list.add(in);
            list1.add(in);
        }
        Collections.reverse(list1);
        for (int k=1;k<list.size();k++) {
            if (Math.abs(list.get(k-1) - list.get(k)) != Math.abs(list1.get(k-1) - list1.get(k))) return "Not Funny";
        }

        return "Funny";
    }
}
