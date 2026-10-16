package pattern.Strutturali.Composite;

import java.util.*;

public class Composite implements Component{
    private List<Component> lista= new LinkedList<>();

    @Override
    public void add(Component c) {
        lista.add(c);
    }

    @Override
    public void remove(Component c) {
        if( lista.contains(c)){lista.remove(c);}
    }

    @Override
    public void operation() {
        System.out.println("oggetto compisto");
    }
    public Component getChild(int i){
        return lista.get(i);
    }
}
