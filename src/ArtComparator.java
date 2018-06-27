import java.util.Comparator;

public class ArtComparator implements Comparator<Produkte> {


    @Override
    public int compare(Produkte o1, Produkte o2) {
        return o1.getArt().compareTo(o2.getArt());
    }
}

