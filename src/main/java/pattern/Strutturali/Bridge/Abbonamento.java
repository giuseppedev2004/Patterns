package pattern.Strutturali.Bridge;

public class Abbonamento extends Acquisto {
    public int importo;
    public Abbonamento(MetodiAbbonamento m, int importo){
        super(m);
        this.importo=importo;
    }

    @Override
    public void paga() {
        if(metodo.autorizza(importo)){
            metodo.acquista();
        }
    }

    public void mensile(){
        System.out.println("il tuo abbonamento sca de giorno x");
    }
}

