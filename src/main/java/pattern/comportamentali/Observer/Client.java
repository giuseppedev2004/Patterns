package pattern.comportamentali.Observer;

    public class Client {
        public static void main(String[] args) {
            // 1. Creo il Subject con uno stato iniziale
            ConcreteSubject dati = new ConcreteSubject("Stato Iniziale (A=50%)");

            // 2. Creo due Observer passando il riferimento al Subject
            ConcreteObserver graficoBarre = new ConcreteObserver("Grafico a Barre", dati);
            ConcreteObserver graficoTorta = new ConcreteObserver("Grafico a Torta", dati);

            // 3. Iscrivo (attach) gli Observer al Subject
            dati.attach(graficoBarre);
            dati.attach(graficoTorta);

            // 4. Modifico lo stato del Subject -> scatterà in automatico notifica()!
            System.out.println("--- Prima modifica al Subject ---");
            dati.setState("Modifica 1 (A=80%)");

            // 5. Disiscrivo (detach) il grafico a barre
            dati.detach(graficoBarre);

            // 6. Modifico di nuovo -> ora riceverà la notifica solo il grafico a torta
            System.out.println("\n--- Seconda modifica al Subject (dopo detach) ---")}
    }
}
