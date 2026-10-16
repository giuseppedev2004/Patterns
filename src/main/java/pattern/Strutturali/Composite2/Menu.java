package pattern.Strutturali.Composite2;

import java.util.ArrayList;
import java.util.List;

public class Menu implements Voce {
    private String nome;
    private List<Voce> voci = new ArrayList<>();

    public Menu(String nome) {
        this.nome = nome;
    }

    @Override
    public double getPrezzo() {
        double totale = 0;                  // 1. parto da zero
        for (Voce v : voci) {               // 2. scorro tutte le voci
            totale += v.getPrezzo();        // 3. sommo (piatto o sotto-menu, non importa)
        }
        return totale;                      // 4. return DOPO il ciclo
    }

    @Override
    public void stampa(String rientro) {
        System.out.println(rientro + nome);
        for (Voce v : voci) {
            v.stampa(rientro + "  ");
        }
    }

    @Override
    public void add(Voce v) {
        voci.add(v);
    }

    @Override
    public void remove(Voce v) {
        voci.remove(v);
    }

    @Override
    public Voce getChild(int i) {
        return voci.get(i);
    }
}