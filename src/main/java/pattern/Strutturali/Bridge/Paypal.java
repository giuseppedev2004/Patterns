package pattern.Strutturali.Bridge;

public class Paypal implements MetodiAbbonamento{
    @Override
    public boolean autorizza(int importo) {
        System.out.println(" paypal hai l'autorizzazione con importo " + importo);
        return true;
    }



    @Override
    public void acquista() {
        System.out.println("paypal prodotto acquistato");
    }
}
