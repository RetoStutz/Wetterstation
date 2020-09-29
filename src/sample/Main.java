package sample;

import Beobachter.Beobachter;

public class Main {
    public static void main(String [] args){
        Wetterstation wetterstation = new Wetterstation();

        Beobachter thermometer = new Thermometer(wetterstation);
        Beobachter anzeige = new Anzeige(wetterstation);
        Beobachter benachrichtigung = new Benachrichtigung(wetterstation);

        wetterstation.registriereBeobachter(thermometer);
        wetterstation.registriereBeobachter(anzeige);
        wetterstation.registriereBeobachter(benachrichtigung);

        wetterstation.benachritigungAlleBeobachter();
        wetterstation.deregistriereBeobachter(thermometer);
        wetterstation.temperatur = 29.0;
        wetterstation.benachritigungAlleBeobachter();
    }
}
