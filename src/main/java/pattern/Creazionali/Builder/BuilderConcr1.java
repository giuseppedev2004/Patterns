package pattern.Creazionali.Builder;

public class BuilderConcr1 implements Builder{


    @Override
    public void buildPartA() {
        System.out.println("aggiungi pane");
    }
    public void buildPartB(){
        System.out.println("aggiungi hamburgher pollo");
    }

    public Prodotto getProdotto() {
        return new Prod1();
    }


}

