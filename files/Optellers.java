package nl.han.dea;

/**
 * Created by Gioo on 08/09/2017.
 */
public class Optellers implements Runnable {
    private String naam;
    private final Teller teller;


    public Optellers(String naam, Teller teller) {
        super();
        this.naam = naam;
        this.teller = teller;
    }

    public void run() {
        while (teller.getGetal() < 100) {
            teller.optellen();
            System.out.println(naam + " heeft 1 opgeteld bij " + teller.getGetal());
        }
        try {
            Thread.sleep(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
