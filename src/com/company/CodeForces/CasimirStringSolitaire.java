package com.company.CodeForces;

import java.util.*;
import java.util.stream.Collectors;

//https://codeforces.com/problemset/problem/1579/A
public class CasimirStringSolitaire {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            boolean present;
            List<Character> list = s.toUpperCase().chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
           do {
               present = false;
               int aIndex = list.indexOf('A');
               int bIndex = list.indexOf('B');
               int cIndex = list.indexOf('C');
               if(aIndex > -1 && bIndex > -1) {
                   list.remove(aIndex);
                   list.add(aIndex, '0');
                   list.remove(bIndex );
                   present = true;
               }else if (cIndex > -1 && bIndex > -1) {
                   list.remove(bIndex);
                   list.add(bIndex, '0');
                   list.remove(cIndex);
                   present = true;
               }
           }while (present);
            System.out.println(list.stream().filter(item -> !item.equals('0')).findAny().isPresent() ? "NO" : "YES");
        }
    }
}
