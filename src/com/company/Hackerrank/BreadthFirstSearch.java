package com.company.Hackerrank;

import java.util.*;

//https://www.hackerrank.com/challenges/bfsshortreach/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
//https://www.youtube.com/watch?v=7RTP7NaHaxE
public class BreadthFirstSearch {
    public static final Scanner scan = new Scanner(System.in);
    private LinkedList<Integer> adj[];

    BreadthFirstSearch(int v) {
        adj = new LinkedList[v+1];
        for (int i = 1; i <= v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void createGraph(int source, int dest) {
        adj[source].add(dest);
        adj[dest].add(source);
    }

    public int bfsLogic(int start, int dest) {
        boolean[] visited = new boolean[adj.length];
        Queue<Integer> queue = new LinkedList<>();
        int parent[] = new int[adj.length];
        parent[start] = -1;
        queue.add(start);
        visited[start-1] = true;

        while(!queue.isEmpty()) {
            int currNode = queue.poll();
            if (currNode == dest) break;
//            resultList.add(currNode); this is elimination order

            for (int neighbour: adj[currNode]) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                    parent[neighbour] = currNode;
                }
            }
        }

        int cur = dest;
        int distance = 0;

        while(parent[cur] != -1) {
            cur = parent[cur];
            distance++;
            if (distance > adj.length) return -1;
        }
        System.out.println("**DISTANCE**"+distance);
//        Arrays.stream(distance).forEach(System.out::println);
        return distance;
    }

    public static void main(String[] args) {
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int nodes = scan.nextInt();
            int edges = scan.nextInt();

            BreadthFirstSearch graph = new BreadthFirstSearch(nodes);
            for (int j = 1; j <= edges; j++) {
                graph.createGraph(scan.nextInt(), scan.nextInt());
            }
            int start = scan.nextInt();

            for (int k =1;k<=nodes;k++) {
                int distance = graph.bfsLogic(start, k);
                System.out.println(distance > 0 ? distance : -1);
            }
        }

    }

}
