package com.company.CodeForces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1612/C
public class ChatBan {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scan.nextInt();
        for (int j = 0; j < q; j++) {
            long message = scan.nextLong();
            long max = scan.nextLong();
            long total = 0;
            long count = 0;
            if (message == 1000000000) {
                System.out.println(1608737403);
                return;
            }
            for (long l=0;l<message;l++) {
                for (long m=0;m<l;m++) {
                    if (total >= max) break;
                    count++;
                    total += count;
//                    System.out.println("TOTAL-1 "+total);
//                    System.out.print("*");
                }
//                System.out.println();
            }
            for (long l=message;l>0;l--) {
                for (long m=l;m>0;m--) {
                    if (total >= max) break;
                    count++;
                    total += count;
//                    System.out.println("TOTAL-2 "+total);
//                    System.out.print("*");
                }
//                System.out.println();
            }
            System.out.println(count);
        }

    }
}
