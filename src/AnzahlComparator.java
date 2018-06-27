import java.util.Comparator;

public class AnzahlComparator implements Comparator<Produkte> {

    public int compare(Produkte o1, Produkte o2) {
        return o1.getAnzahl() - o2.getAnzahl();


    }

}