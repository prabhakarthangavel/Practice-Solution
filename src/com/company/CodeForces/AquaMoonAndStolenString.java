package com.company.CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//https://codeforces.com/contest/1546/problem/B
public class AquaMoonAndStolenString {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] arg) {
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
           int n = scan.nextInt();
           int m = scan.nextInt();
           String[] str = new String[(n*2)-1];
           List<Character> characterList = new ArrayList<>();
           int missingIndex = -1;
           char[] chAr = new char[(n*2)-1];
           for (int j =0;j<(n*2)-1;j++) {
               str[j] = scan.next();
               characterList.add(str[j].charAt(0));
//               chAr[j] = str[j].charAt(0);
           }
//            System.out.println(characterList);
           for (int k=0;k<characterList.size();k++) {
               List<Character> subList = new ArrayList<>();
               if (k != 0) subList.addAll(characterList.subList(0, k));
               subList.addAll(characterList.subList(k+1, characterList.size()));
               char ch = characterList.get(k);
//               System.out.println("k: "+k+" "+subList);
               if (!subList.contains(ch)) {
                   missingIndex=k;
                   break;
               }
           }
            System.out.println(str[missingIndex]);
        }
    }
}
