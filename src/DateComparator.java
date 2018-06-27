import java.util.Comparator;

public class DateComparator implements Comparator<Produkte> {


    @Override
    public int compare(Produkte o1, Produkte o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}

