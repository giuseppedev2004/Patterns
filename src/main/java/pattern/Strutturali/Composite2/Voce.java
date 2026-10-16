package pattern.Strutturali.Composite2;

public interface Voce {
    double getPrezzo();
    void stampa(String rientro);
    void add(Voce v);
    void remove(Voce v);
    Voce getChild(int i);
}

