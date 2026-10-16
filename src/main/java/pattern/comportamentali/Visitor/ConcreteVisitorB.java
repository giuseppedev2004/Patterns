package pattern.comportamentali.Visitor;

public class ConcreteVisitorB {
    public void visitB(Element elemB) {
        System.out.println(" sono b visito b");
    }

    @Override
    public void visitA(Element elemA) {
        System.out.println("sono b visito a");
    }
}
