package pattern.comportamentali.Observer;

public class ConcreteObserver implements Observer {


    private ConcreteSubject obsstae;

    @Override
    public void update() {
        obsstae.getState();

    }
}
