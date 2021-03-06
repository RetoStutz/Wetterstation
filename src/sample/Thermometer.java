package sample;

import Beobachter.Beobachter;
import Subjekt.Subjekt;

public class Thermometer implements Beobachter {

    private Subjekt subjekt;

    public void setzeTemperatur(double temp){
        System.out.println("Anzeige zeigt nun "+temp+" Gradn an!");
    }

    @Override
    public void aktualisieren() {
        this.setzeTemperatur(((Wetterstation)subjekt).
                getTemperatur());
    }

    public Thermometer (Subjekt subjekt){
        this.subjekt = subjekt;
    }
}
