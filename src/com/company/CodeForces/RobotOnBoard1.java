package com.company.CodeForces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1607/E
public class RobotOnBoard1 {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scan.nextInt();
        for (int l=0;l<q;l++) {
            int height = scan.nextInt();
            int width = scan.nextInt();
            String steps = scan.next();
            int[][] arr = new int[height][width];
            int maxHeight = 1;
            int maxWidth = 1;
            int maxCount = 0;

            int ht = 1;
            int wd = 0;
            int count = 0;
            for (int i=0;i<height*width;i++) {
                wd++;
                count = 0;
                if (wd > width) {
                    ht++;
                    wd = 1;
                }
                int htTmp = ht;
                int wdTmp = wd;
                for (int j=0;j<steps.length();j++) {
                    if (wdTmp > width) {
                        htTmp++;
                        wdTmp = 1;
                    }
                    if (steps.charAt(j) == 'D') {
                        if (htTmp < height) {
                            htTmp++;
                            count++;
                        }else {
                            //set max values
                            break;
                        }
                    }else if (steps.charAt(j) == 'U') {
                        if (htTmp > 1) {
                            htTmp--;
                            count++;
                        }else {
                            //set max values
                            break;
                        }
                    }else if (steps.charAt(j) == 'R') {
                        if (wdTmp < width) {
                            wdTmp++;
                            count++;
                        }else {
                            //set max values
                            break;
                        }
                    }else if (steps.charAt(j) == 'L') {
                        if (wdTmp > 1) {
                            wdTmp--;
                            count++;
                        }else {
                            //set max values
                            break;
                        }
                    }
                    if (htTmp < 1 || wdTmp < 1) {
                        //set max values
                        break;
                    }
                    //set max values
                    if (count > maxCount) {
                        maxHeight = ht;
                        maxWidth = wd;
                        maxCount = count;
                    }
                }
//                System.out.println(ht+ " "+wd+ " "+count);
            }
            System.out.println(maxHeight + " "+maxWidth);
        }
    }
}
