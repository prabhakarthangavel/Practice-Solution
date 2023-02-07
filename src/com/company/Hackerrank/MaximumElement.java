package com.company.Hackerrank;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/maximum-element/problem
public class MaximumElement {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<n;i++) {
            int operation = scan.nextInt();
            int num = 0;
            if (operation == 1) {
                num = scan.nextInt();
            }
            switch (operation) {
                case (1):
                    stack.push(num);
                    break;
                case (2):
                    stack.pop();
                    break;
                case (3):
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
