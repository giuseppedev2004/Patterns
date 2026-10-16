package pattern.Strutturali.Proxy;

public class Main {
    private Video v;
    public static void main(String[] args){
        Video v= new VideoProxy("NICO ");
        v.play();
        v.getTitolo();

    }
}
