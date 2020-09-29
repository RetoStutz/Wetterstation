package sample;

import Beobachter.Beobachter;
import Subjekt.Subjekt;

import java.util.ArrayList;

public class Wetterstation implements Subjekt {
    public double temperatur = 20.0;

    ArrayList<Beobachter> beobachterListe = new ArrayList<Beobachter>();

    public double getTemperatur(){
        return temperatur;
    }



    public void benachritigungAlleBeobachter(){
        for (Beobachter beobachter : beobachterListe){
            beobachter.aktualisieren();
        }

    }

    @Override
    public void registriereBeobachter(Beobachter beobachter) {
        beobachterListe.add(beobachter);

    }

    @Override
    public void deregistriereBeobachter(Beobachter beobachter) {
        beobachterListe.remove(beobachter);
    }


}

