package com.company.others;

import java.util.function.Function;

@FunctionalInterface
interface Summing {
    int add(int a, int b);
}
public class LamdaExpr {

    public static void main(String[] args) {
        Summing sum = (a, b) -> a + b;
        System.out.println(sum.add(2, 4));

        Function<Integer, Integer> function = a -> a * a;
        System.out.println(function.apply(5));
        System.out.println(function.andThen(a -> a - 1).apply(5));

    }
}
