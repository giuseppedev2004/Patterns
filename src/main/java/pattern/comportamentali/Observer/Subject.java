package pattern.comportamentali.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {


    List<Observer> obs= new ArrayList<>();
    public void attach(Observer o){
        obs.add(o);
    }

    public void detach(Observer o){
        obs.remove(o);
    }

    public void notifica(){
        for(Observer o: obs){
            o.update();
        }
    }




}
