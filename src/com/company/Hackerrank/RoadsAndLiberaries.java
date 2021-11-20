package com.company.Hackerrank;

import java.util.*;

//https://www.hackerrank.com/challenges/torque-and-development/problem
public class RoadsAndLiberaries {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] arg) {
        int q = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int c_road = scan.nextInt();
        int c_lib = scan.nextInt();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i=1;i<=n;i++) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            map.put(i, list);
        }

        for (int i = 1; i <= m; i++) {
            int key = scan.nextInt();
            int value = scan.nextInt();
            map.get(key).add(value);
            map.get(value).add(key);
        }

        Set<Integer> visitedCities = new HashSet<>();
        map.entrySet().stream().forEach(mp -> {
            if(!visitedCities.contains(mp.getKey())) {
                visitedCities.add(mp.getKey());
                List<Integer> currentCity = new ArrayList<>();
                currentCity.addAll(map.get(mp.getKey()));

                Queue<List<Integer>> queue = new LinkedList<>();
                queue.add(map.get(mp.getKey()));
                while(!queue.isEmpty()) {
                    List<Integer> conected_city_id = queue.poll();

                }

            }
        });
        map.entrySet().stream().forEach(value -> System.out.println(value.getKey() + " " + value.getValue()));
    }
}
