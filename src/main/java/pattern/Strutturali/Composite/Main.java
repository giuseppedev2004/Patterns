package pattern.Strutturali.Composite;

public class Main {
    public static void main(String[] args ){
        Component c= new Composite();
        Component s= new Leaf();
        c.operation();
        c.add(s);
        c.getChild(0);
        s.operation();
    }
}
