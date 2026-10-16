package pattern.Creazionali.AbstractFactory;

public class ConcreteFactory2 implements AbstractFactory{

    @Override
    public ProductA createProduct() {
        System.out.println("a2 creato");
        return new ConcreteProductA2() ;

    }

    @Override
    public ProductB createProductB() {
        System.out.println("b2 creato");
        return new ConcreteProductB2();
    }
}

