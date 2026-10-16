package pattern.Creazionali.AbstractFactory;

public class ConcreteFactory1 implements AbstractFactory{

    @Override
    public ProductB createProductB() {
        System.out.println("b1 creato");
        return new ConcreteProductB1();
    }

    @Override
    public ProductA createProduct() {
        System.out.println("a1 creato");
        return new ConceteProductA1();
    }
}
