package pattern.Creazionali.Builder;

public class BuildConcr2 implements Builder{

    @Override
    public void buildPartA() {
        System.out.println("metti pane");
    }

    @Override
    public void buildPartB() {
        System.out.println("metti verdure");
    }
    public Prodotto getProdotto() {
        return new Prod2();
    }
}
