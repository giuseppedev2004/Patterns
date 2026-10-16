package pattern.Strutturali.Proxy;

public class VideoProxy implements  Video{
    private VideoVero v;
    private String titolo;
    public VideoProxy(String titolo){
        this.titolo=titolo;

    }
    public void play(){
        if (v == null) {
            v = new VideoVero(titolo);   // creo solo ora
        }
        v.play();
    }
    public String getTitolo(){
        return  v.getTitolo();
    }

}

