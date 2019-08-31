package training.patterns.behavioral;

public class StrategyExamp {
    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        int resultAdd = context.executeStrategy(3,4);
        System.out.println("Result Add: " + resultAdd);

        context.setStrategy(new ConcreteStrategySubtract());
        int resultSubtract = context.executeStrategy(3,4);
        System.out.println("Result Subtract: " + resultSubtract);

        context.setStrategy(new ConcreteStrategyMultiply());
        int resultMultiply = context.executeStrategy(3,4);
        System.out.println("Result Multiply: " + resultAdd);

    }

}

interface Strategy{
    int execute(int a, int b);
}


class ConcreteStrategyAdd implements Strategy{

    @Override
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyAdd's execute()");
        return a + b;
    }
}

class ConcreteStrategySubtract implements Strategy{

    @Override
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategySubtract's execute()");
        return a - b;
    }
}

class ConcreteStrategyMultiply implements Strategy{
    @Override
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyMultiply's execute()");
        return a * b;
    }
}

class Context{
    private Strategy strategy;

    public Context() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b){
        return strategy.execute(a, b);
    }
}