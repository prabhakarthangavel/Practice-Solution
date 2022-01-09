package com.company.Hackerrank;

import java.util.*;

//https://www.hackerrank.com/challenges/even-tree/problem?isFullScreen=false
public class EvenTree {

    public static final Scanner scan = new Scanner(System.in);
    LinkedList<Integer> adj[];

    EvenTree(int node) {
        adj = new LinkedList[node + 1];
        for (int i = 1; i <= node; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        int node = scan.nextInt();
        int edges = scan.nextInt();

        EvenTree evenTree = new EvenTree(node);
        for (int i = 0; i < edges; i++) {
            evenTree.createGraph(scan.nextInt(), scan.nextInt());
        }

        Arrays.stream(evenTree.adj).forEach(System.out::println);
        System.out.println(evenTree.findEvenTree());
    }

    public void createGraph(int start, int end) {
        adj[start].add(end);
        adj[end].add(start);
    }

    public int findEvenTree() {
        LinkedList<Integer> list = adj[1]; //2,3,6
        for (int i = 0; i < list.size(); i++) {
            LinkedList<Integer> innerList = adj[list.get(i)]; //1,5,7
            innerList.add(list.get(i));
            for (int j = 0; j < innerList.size(); j++) {
                adj[innerList.get(j)].stream().forEach(value -> {
                            if (!innerList.contains(value) && !list.contains(value)) innerList.add(value);
                        }
                );
                if (innerList.size() % 2 == 0) return list.size() - 1;
            }
//            System.out.println("INNERLIST");
//            innerList.forEach(System.out::println);
        }
        return list.size() - 2;
    }

}
