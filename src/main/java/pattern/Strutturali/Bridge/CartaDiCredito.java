package pattern.Strutturali.Bridge;

public class CartaDiCredito implements  MetodiAbbonamento{


    @Override
    public boolean autorizza(int importo) {
        System.out.println(" carta credito hai l'autorizzazione con importo " + importo);
        return true;
    }



    @Override
    public void acquista() {
        System.out.println(" carta credito prodotto acquistato");
    }
}
