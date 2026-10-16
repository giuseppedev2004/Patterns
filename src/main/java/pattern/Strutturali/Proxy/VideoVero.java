package pattern.Strutturali.Proxy;

public class VideoVero implements Video{
    private String titolo;
    public VideoVero(String titolo){
        this.titolo=titolo;
        System.out.println("Carico il video: " + titolo + " (lento!)");
    }
    @Override
    public void play() {
        System.out.println("Starta sto video di merda");
    }
    public String getTitolo(){
        return titolo;

    }
}
