package nl.han.dea;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class OptelParty
{
    public static void main( String[] args )
    {
        Teller telmeneer = new Teller(0);


        ArrayList<Optellers> personen = new ArrayList<Optellers>();

        personen.add(new Optellers("Roel", telmeneer ));
        personen.add(new Optellers("Gio", telmeneer));
        personen.add(new Optellers("Stijn", telmeneer));

        for(Optellers opteller : personen) {
            new Thread(opteller).start();
    }

    }
}
