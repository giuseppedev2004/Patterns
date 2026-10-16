package pattern.Creazionali.Builder;

public class Director {

    public void build(Builder b){
        b.buildPartA();
        b.buildPartB();

    }
}
