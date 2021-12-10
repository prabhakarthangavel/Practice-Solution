package com.company.Hackerrank;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

//https://www.hackerrank.com/challenges/journey-to-the-moon/problem?isFullScreen=false
//https://www.geeksforgeeks.org/disjoint-set-data-structures/
public class JourneyToTheMoon {

    int[] rank, parent;
    int m;

    public JourneyToTheMoon(int m)
    {
        rank = new int[m];
        parent = new int[m];
        this.m = m;
        makeSet();
    }

    public void makeSet()
    {
        for (int i = 0; i < m; i++) {
            parent[i] = i;
        }
    }

    public int find(int x)
    {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    void union(int x, int y)
    {
        int xRoot = find(x), yRoot = find(y);
        if (xRoot == yRoot)
            return;
        if (rank[xRoot] < rank[yRoot])
            parent[xRoot] = yRoot;
        else if (rank[yRoot] < rank[xRoot])
            parent[yRoot] = xRoot;
        else
        {
            parent[yRoot] = xRoot;
            rank[xRoot] = rank[xRoot] + 1;
        }
        Arrays.stream(parent).forEach(System.out::println);
    }

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int p = scan.nextInt();
        JourneyToTheMoon journey = new JourneyToTheMoon(n);
        for (int i = 0; i < p; i++) {
            journey.union(scan.nextInt(), scan.nextInt());
        }

//        List<int[]> result = new ArrayList<int[]>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                    int iIndex = i;
                    int jIndex = j;
                    if (journey.find(iIndex) != journey.find(jIndex)) {
//                        result.add(new int[]{iIndex, jIndex});
                        count++;
                    }
            }
        }
//        result.forEach(array -> {
//            System.out.println(array[0] + " "+array[1]);
//        });
        System.out.println(count);
    }
}
