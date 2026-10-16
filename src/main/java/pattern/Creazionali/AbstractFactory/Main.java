package pattern.Creazionali.AbstractFactory;

public class Main {
    public static void main(String[] args){
        AbstractFactory abs= new ConcreteFactory1();
        AbstractFactory abs2= new ConcreteFactory2();

        ProductA a1 = abs.createProduct();
        ProductB b1 = abs.createProductB();

        ProductA a2 = abs2.createProduct();
        ProductB b2 = abs2.createProductB();
        a2.Ciao();
        a1.Ciao();
        b1.Ciao();
        b2.Ciao();
    }

}
