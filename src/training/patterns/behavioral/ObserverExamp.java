package training.patterns.behavioral;

import java.util.ArrayList;
import java.util.List;

public class ObserverExamp {
    public static void main(String[] args) {

        ConcreteObservable observable = new ConcreteObservable();
        ConcreteObserver observer = new ConcreteObserver(observable);

        observable.addObserver(new ConcreteObserver(observable));
        observable.setMessage("Новое сообщение");


    }
}

interface Observable{
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}

class ConcreteObservable implements Observable{

    private List<Observer> observers;
    private String message;

    public ConcreteObservable() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.stream().forEach(observer -> observer.handleEvent(message));
    }

    public void setMessage(String message){
        this.message = message;
        notifyObserver();
    }

}



interface Observer{
    void handleEvent(String message);
}

class ConcreteObserver implements Observer{
    private String message;
    private ConcreteObservable observable;

    @Override
    public void handleEvent(String message) {
        this.message = message;
        display();
    }

    public ConcreteObserver(ConcreteObservable observable) {
        this.observable = observable;
    }

    public void display(){
        System.out.println("Сообщение: " + message);
    }
}
