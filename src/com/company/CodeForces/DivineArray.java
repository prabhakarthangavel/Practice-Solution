package com.company.CodeForces;

import java.util.*;

//https://codeforces.com/problemset/problem/1602/B
public class DivineArray {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scan.nextInt();
        for (int k = 0; k < q; k++) {
            int n = scan.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int l = 0; l < n; l++) {
                list.add(scan.nextInt());
            }

            List<List<Integer>> listList = new ArrayList<>();
            listList.add(list);
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            boolean same;
            int count1 = 0;
            do {
                List<Integer> inList = new ArrayList<>();
                for (Integer s : listList.get(listList.size() - 1)) {
                    int frequency = Collections.frequency(listList.get(listList.size() - 1), s);
                    inList.add(frequency);
                }
                listList.add(inList);
                list1 = listList.get(listList.size() - 1);
                list2 = listList.get(listList.size() - 2);
                same = true;
//                for (int i = 0; i < list1.size(); i++) {
//                    if (list1.get(i) != list2.get(i)) {
//                        same = false;
//                        break;
//                    }
//                }
                count1++;
            } while (count1 < 15); // running max of 15 times to make the all the list are equal or compare the last 2 lists
//            System.out.println(listList);

            int test = scan.nextInt();
            for (int i=0;i<test;i++) {
                int index = scan.nextInt();
                int count = scan.nextInt();
                System.out.println(count < listList.size() ? listList.get(count).get(index-1) : listList.get(listList.size()-1).get(index-1));
            }
        }
    }
}
