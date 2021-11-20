package com.company.Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SherlockAndAnagrams {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(sherlockAndAnagrams(scan.next()));
        }
    }

    public static int sherlockAndAnagrams(String s) {
        int result = 0;
        StringBuilder sb = new StringBuilder(s);
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((s.substring(0, i) + s.substring(i + 1)).contains(String.valueOf(ch)) && !list.contains(Character.valueOf(ch))) {
                list.add(Character.valueOf(ch));
                result++;
            }
        }
        if (result == 0 || s.length() < 2) return result;
        System.out.println("result"+result);
        int count = 2;
        List<String> subs = new ArrayList<>();
        while (count < s.length()) {
            for (int i = 0; i <= s.length() - count; i++) {
                System.out.println(s.substring(i, i+count));
                char[] chars = s.substring(i, i+count).toCharArray();
                Arrays.sort(chars);
                subs.add(String.valueOf(chars));
            }

            for (int i =0;i<subs.size();i++) {
                String st = subs.get(i);
                subs.remove(i);
                if (subs.contains(st)) result++;
                subs.add(i, st);
            }

            subs.clear();
            count++;
        }


//        subs.forEach(System.out::println);

        return result;
    }
}
