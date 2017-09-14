package nl.han.dea;

/**
 * Created by Gioo on 08/09/2017.
 */
public class Teller {
    private int getal;


    public Teller(int getal) {
        this.getal = getal;
    }

    public synchronized void optellen(){
        if(this.getal < 100) {
            this.getal++;
        }
    }

    public int getGetal() {
        return getal;
    }
}
