package pattern.comportamentali.Visitor;

public class ElementA implements Element{

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    public void Operazione(){
        System.out.println("elemento a");
    }
}
