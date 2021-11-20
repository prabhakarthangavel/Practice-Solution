package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int m = scan.nextInt();
        for(int j=0;j<m;j++) {
            int n = scan.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<=n;i++) {
                if(valid(i)) list.add(i);
            }
            int[][] dp = new int[list.size()+1][n+1];

            for(int col=0;col<dp[0].length;col++) dp[0][col]=Integer.MAX_VALUE;
            for(int row=1;row<dp.length;row++) dp[row][0]=0;

            for(int row=1;row<dp.length;row++) {
                for(int col=1;col<dp[0].length;col++) {
                    if(list.get(row-1)>col) {
                        dp[row][col] = dp[row-1][col];
                    }else if(dp[row][col-list.get(row-1)] == Integer.MAX_VALUE) {
                        dp[row][col] = dp[row-1][col];
                    }else {
                        dp[row][col] = Math.min(1+dp[row][col-list.get(row-1)], dp[row-1][col]);
                    }
                }
            }
            System.out.println(dp[list.size()][n] == Integer.MAX_VALUE ? -1:
                    dp[list.size()][n]);
        }
    }

    public static boolean valid(int n) {
        String str = String.valueOf(n);
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)!='4' && str.charAt(i)!='5') return false;
        }
        return true;
    }
}
