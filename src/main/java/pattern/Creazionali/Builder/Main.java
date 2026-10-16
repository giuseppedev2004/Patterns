package pattern.Creazionali.Builder;

public class Main {
    public static void main(String[] args){
        Director d= new Director();
        BuilderConcr1 b1= new BuilderConcr1();
        Builder b2 = new BuildConcr2();
        d.build(b1);
        d.build(b2);


    }
}
