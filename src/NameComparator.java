import java.util.Comparator;

public class NameComparator implements Comparator<Produkte> {



        public int compare(Produkte o1, Produkte o2) {
            return o1.getName().compareTo(o2.getName());

        }
    }


