package training.functional_Interface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExamp {

    public static void main(String[] args) {

        UnaryOperator<String> upper = x -> x.toUpperCase();

        System.out.println(upper.apply("tratata"));
    }
}
