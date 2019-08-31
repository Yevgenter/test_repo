package training.functional_Interface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExamp {
    public static void main(String[] args) {

        BinaryOperator<String> toMergerWithSpace = (x, y) -> x + " " + y;

        System.out.println(toMergerWithSpace.apply("Hello", "World!"));

    }
}
