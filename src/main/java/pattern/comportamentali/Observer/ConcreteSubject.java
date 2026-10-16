package pattern.comportamentali.Observer;

public class ConcreteSubject  extends Subject{

    private String x;
    public ConcreteSubject(String x){
        this.x=x;
    }

    public String getState() {
        return x;
    }
    public void setState(String x){
        this.x=x;
    }
}
