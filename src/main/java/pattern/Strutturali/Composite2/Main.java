package pattern.Strutturali.Composite2;

import pattern.Strutturali.Composite.Component;

public class Main {


        public static void main(String[] args) {
            // 1. Piatti (le foglie)
            Voce bruschetta = new Piatto("Bruschetta", 5.0);
            Voce tagliere = new Piatto("Tagliere", 9.0);
            Voce pizza = new Piatto("Pizza Margherita", 7.0);
            Voce tiramisu = new Piatto("Tiramisù", 5.0);
            Voce pannaCotta = new Piatto("Panna cotta", 4.5);

            // 2. Sotto-menu
            Voce antipasti = new Menu("Antipasti");
            antipasti.add(bruschetta);
            antipasti.add(tagliere);

            Voce dolci = new Menu("Dolci");
            dolci.add(tiramisu);
            dolci.add(pannaCotta);

            // 3. Menu principale (la radice)
            Voce menuPranzo = new Menu("Menu Pranzo");
            menuPranzo.add(antipasti);
            menuPranzo.add(pizza);
            menuPranzo.add(dolci);

            // 4. Uso: solo sulla radice
            menuPranzo.stampa("");
            System.out.println("Totale: " + menuPranzo.getPrezzo() + "€");
        }
    }
