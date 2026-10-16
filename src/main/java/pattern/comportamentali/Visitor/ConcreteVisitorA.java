package pattern.comportamentali.Visitor;

public class ConcreteVisitorA  implements Visitor{

    @Override
    public void visitB(Element elemB) {
        System.out.println("visito b");
    }

    @Override
    public void visitA(Element elemA) {
        System.out.println("visito a");
    }
}
