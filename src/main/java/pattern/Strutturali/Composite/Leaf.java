package pattern.Strutturali.Composite;

public class Leaf implements Component{

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException("Una Leaf non può avere figli");
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException("Una Leaf non ha figli da rimuovere");
    }

    @Override
    public Component getChild(int i) {
        throw new UnsupportedOperationException("Una Leaf non ha figli");
    }

    @Override
    public void operation() {
        System.out.println("leaf");
    }
}
