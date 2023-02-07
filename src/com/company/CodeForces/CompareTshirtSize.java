package com.company.CodeForces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1741/A
public class CompareTshirtSize {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scan.nextInt();
        for (int i = 0; i < tests; i++) {
            String firsOne = scan.next();
            String secondOne = scan.next();
            int firstChar = getIntValue(firsOne.charAt(firsOne.length()-1));
            int secondChar = getIntValue(secondOne.charAt(secondOne.length()-1));
            System.out.println((firstChar + (firstChar * firsOne.length()))  >  (secondChar + (secondChar * secondOne.length())) ? ">": (firstChar + (firstChar * firsOne.length()))  <  (secondChar + (secondChar * secondOne.length())) ? "<": "=");
        }
    }

    static int getIntValue(char ch) {
        return ch == 'S' ? -1 : ch == 'L' ? 1 : 0;
    }
}
