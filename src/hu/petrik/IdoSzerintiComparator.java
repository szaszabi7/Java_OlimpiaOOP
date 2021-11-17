package hu.petrik;

import java.util.Comparator;

public class IdoSzerintiComparator implements Comparator<Versenyzo> {

    @Override
    public int compare(Versenyzo o1, Versenyzo o2) {
        /*int valasz;
        if (o1.getMasodperc() > o2.getMasodperc()) valasz = 1;
        else if (o1.getMasodperc() < o2.getMasodperc()) valasz = -1;
        else valasz = 0;
        return valasz;*/
        return o1.getMasodperc() - o2.getMasodperc();
    }
}
