package pattern.Strutturali.Bridge;

public class Ordine extends Acquisto{

    private int importo;
    public Ordine(MetodiAbbonamento m, int importo){
        super(m);
        this.importo=importo;

    }

    @Override
    public void paga() {
        if(metodo.autorizza(importo)){
            metodo.acquista();
        }
    }
}
