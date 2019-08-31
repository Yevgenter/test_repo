package training.functional_Interface;

import java.util.function.Function;

public class FunctionExamp {

    public static void main(String[] args) {

        Function<Integer, String> convert = x -> String.valueOf(x) + " гривен";
        System.out.println(convert.apply(100));

    }
}
