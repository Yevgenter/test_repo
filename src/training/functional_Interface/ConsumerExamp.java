package training.functional_Interface;

import java.util.function.Consumer;

public class ConsumerExamp {

    public static void main(String[] args) {
        Consumer<Integer> printer = x -> System.out.printf("%d долларов ", x);
        printer.accept(20);
    }

}
