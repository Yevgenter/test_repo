package training.functional_Interface;

import java.util.function.Predicate;

public class PredicateExamp {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = x -> x>0;
        System.out.println(isPositive.test(3));
        System.out.println(isPositive.test(-3));

        Predicate<String> containsA = x -> x.contains("A");
        System.out.println(containsA.test("ABC"));
        System.out.println(containsA.test("abc"));
    }
}
