package pattern.Strutturali.Composite2;

public class Piatto implements Voce {
    private String nome;
    private double prezzo;

    public Piatto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public void stampa(String rientro) {
        System.out.println(rientro + nome + " - " + prezzo + "€");
    }

    @Override
    public void add(Voce v) {
        throw new UnsupportedOperationException("Un piatto non può contenere altro");
    }

    @Override
    public void remove(Voce v) {
        throw new UnsupportedOperationException("Un piatto non può contenere altro");
    }

    @Override
    public Voce getChild(int i) {
        throw new UnsupportedOperationException("Un piatto non ha figli");
    }
}