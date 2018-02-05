package com.handsonjava.lambdas;

import java.util.function.Predicate;

public class PredicateLammda<T> {

    protected boolean isTrue(Predicate<T> tPredicate, T t) {
        return tPredicate.test(t);
    }

    private static Predicate<String> getResultForTheCondition(String t) {
        return (element) -> {
            if (t.contains("ad")) {
                return true;
            } else {
                return false;
            }
        };
    }

    public static Predicate<Integer> getResult(int dividend, int divisor) {
        return (element) -> {
            if(divisor == 0 ){
                throw new IllegalArgumentException("");
            }
            return dividend % divisor == 0;
        };
    }

    public static void main(String[] args) {
        PredicateLammda<Integer> predicateLammda = new PredicateLammda<>();
        System.out.println(predicateLammda.isTrue(getResult(8,2), 1));

        Predicate<Integer> stringPredicate = (element) -> element.equals(2);

        boolean re = predicateLammda.isTrue(stringPredicate, 2);

        if (re) {
            System.out.println("you'r getting it right. Don't loose hope");
        }
    }
}
