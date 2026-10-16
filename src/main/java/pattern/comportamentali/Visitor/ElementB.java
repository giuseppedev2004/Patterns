package pattern.comportamentali.Visitor;

public class ElementB implements Element{

    @Override
    public void accept(Visitor v) {
        v.visitB(this);
    }
    public void operazione(){
        System.out.println("visita b");
    }
}
