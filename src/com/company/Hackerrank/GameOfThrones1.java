package com.company.Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/game-of-thrones/problem?h_r=next-challenge&h_v=zen
public class GameOfThrones1 {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scan.next();
        System.out.println(gameOfThrones(s));
    }

    public static String gameOfThrones(String s) {
        List<Character> list = new ArrayList<>();
        int oddCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!list.contains(ch)) {
                list.add(ch);
                int count = 0;
                int index = s.indexOf(ch);
                while (index >= 0) {
                    count++;
                    index = s.indexOf(ch, index + 1);
                }
                if (count%2 != 0) oddCount++;
                if (s.length() % 2 != 0 && oddCount > 1) {
                    return "NO";
                } else if (s.length() % 2 == 0 && count %2 != 0) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}


//    static String gameOfThrones(String s) {
//        String a="abcdefghijklmnopqrstuvwxyz";
//        int oc=0,ec=0;
//        int l=s.length();
//        for(int i=0;i<26;i++)
//        {
//            int c=0;
//            for(int j=0;j<l;j++)
//            {
//                if(a.charAt(i)==s.charAt(j))
//                    c++;
//            }
//            if(c%2==0)
//                ec++;
//            else
//                oc++;
//        }
//        if(oc<=1)
//            return "YES";
//        else if(oc==2&&l%2==0)
//            return "YES";
//        else
//            return "NO";
//
//    }