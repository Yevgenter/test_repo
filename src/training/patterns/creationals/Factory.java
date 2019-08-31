package training.patterns.creationals;

import java.util.Iterator;
import java.util.List;

public class Factory {
    public static void main(String[] args) {
        System.out.println(new CarFactory().getCar("bmw").getName());

    }
}

interface Car{
    public String getName();
}

class BMV implements Car{
    @Override
    public String getName() {
        return "BMW CAR";
    }
}
class KIA implements Car{
    @Override
    public String getName() {
        return "KIA CAR";
    }
}

class CarFactory{

    private List<Car> carList;

    public Car getCar(String model){

        switch (model){
            case "bmw": return new BMV();
            case "kia": return new KIA();
            default:return new KIA();
        }
    }
}
