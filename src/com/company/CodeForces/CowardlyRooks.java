package com.company.CodeForces;

import java.util.*;

//https://codeforces.com/problemset/problem/1749/A
public class CowardlyRooks {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scan.nextInt();
        for (int i = 0; i < tests; i++) {
            int chessBoardSize = scan.nextInt();
            int noOfRooks = scan.nextInt();
            Map<Integer, Integer> nonEmptyRow = new HashMap<>();
            Map<Integer, Integer> nonEmptyColumn = new HashMap<>();
            for (int j = 0; j < noOfRooks; j++) {
                int row = scan.nextInt() - 1;
                int column = scan.nextInt() - 1;
                if (nonEmptyRow.containsKey(row)) {
                    nonEmptyRow.put(row, nonEmptyRow.get(row) + 1);
                } else {
                    nonEmptyRow.put(row, 1);
                }
                if (nonEmptyColumn.containsKey(column)) {
                    nonEmptyColumn.put(column, nonEmptyColumn.get(column) + 1);
                } else {
                    nonEmptyColumn.put(column, 1);
                }
            }
            System.out.println(isMovePossible(chessBoardSize, nonEmptyRow, nonEmptyColumn));
        }
    }

    static String isMovePossible(int chessBoardSize, Map<Integer, Integer> nonEmptyRow, Map<Integer, Integer> nonEmptyColumn) {
        for (int j = 0; j < chessBoardSize; j++) {
            if (!nonEmptyRow.containsKey(j)) {
                if ((nonEmptyColumn.containsKey(j - 1) && (nonEmptyColumn.get(j - 1) == 1)) || (nonEmptyColumn.containsKey(j) && (nonEmptyColumn.get(j) == 1)) || (nonEmptyColumn.containsKey(j + 1) && (nonEmptyColumn.get(j + 1) == 1))) {
                    return "YES";
                }
            }
            if (!nonEmptyColumn.containsKey(j)) {
                if ((nonEmptyRow.containsKey(j - 1) && (nonEmptyRow.get(j - 1) == 1)) || (nonEmptyRow.containsKey(j) && (nonEmptyRow.get(j) == 1)) || (nonEmptyRow.containsKey(j + 1) && (nonEmptyRow.get(j + 1) == 1))) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
