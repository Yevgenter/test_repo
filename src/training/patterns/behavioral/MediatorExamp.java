package training.patterns.behavioral;

public class MediatorExamp {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(m);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(m);

        m.setColleague1(colleague1);
        m.setColleague2(colleague2);

        colleague1.send("How are you?");
        colleague2.send("Fine, thanks");
    }
}



abstract class Colleague{
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message){
        mediator.send(message, this);
    }

    public abstract void notify(String message);
}





abstract class Mediator{
    public abstract void send(String message, Colleague sender);
}


class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague1 gets message: " + message);
    }
}


class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague2 gets message: "+ message);

    }
}



class ConcreteMediator extends Mediator{
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague sender) {
        if(sender.equals(colleague2)){
            colleague1.notify(message);
        }
        else {
            colleague2.notify(message);
        }
    }
}