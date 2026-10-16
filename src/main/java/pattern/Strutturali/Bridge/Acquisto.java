package pattern.Strutturali.Bridge;

public  abstract class Acquisto {

    protected MetodiAbbonamento metodo;
    public Acquisto(MetodiAbbonamento m){
        this.metodo=m;
    }
    public  abstract void paga();



    }

