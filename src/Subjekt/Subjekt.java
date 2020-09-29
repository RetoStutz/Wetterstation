package Subjekt;

import Beobachter.Beobachter;
import sample.Benachrichtigung;

public interface Subjekt {
    public void benachritigungAlleBeobachter();
    public void registriereBeobachter (Beobachter beobachter);
    public void deregistriereBeobachter (Beobachter beobachter);
}
