package pattern.Strutturali.Bridge;

public class Main {
    public static void main(String[] args){

        Acquisto a= new Ordine(new CartaDiCredito(), 100);
        a.paga();
        Acquisto b= new Abbonamento(new Paypal(), 20);
        b.paga();
    }
}
