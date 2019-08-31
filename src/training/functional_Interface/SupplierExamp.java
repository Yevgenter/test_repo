package training.functional_Interface;

import java.util.function.Supplier;

public class SupplierExamp {

    public static void main(String[] args) {
        Supplier<Double> randomNumberFactory = () -> Math.random()*100;

        System.out.println(randomNumberFactory.get());
        System.out.println(randomNumberFactory.get());
        System.out.println(randomNumberFactory.get());
    }
}
