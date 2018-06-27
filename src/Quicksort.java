import java.util.ArrayList;
import java.util.Comparator;

public class Quicksort {


    public void namequicksort (ArrayList<Produkte> list){

        Comparator<Produkte> comp = new NameComparator();
        _quicksort(list, 0, list.size()-1, comp);
        }

    public void datequicksort (ArrayList<Produkte> list){

        Comparator<Produkte> comp = new DateComparator();
        _quicksort(list, 0, list.size()-1, comp);
    }

    public void artquicksort (ArrayList<Produkte> list){

        Comparator<Produkte> comp = new ArtComparator();
        _quicksort(list, 0, list.size()-1, comp);
    }

    public void anzahlquicksort (ArrayList<Produkte> list){

        Comparator<Produkte> comp = new AnzahlComparator();
        _quicksort(list, 0, list.size()-1, comp);
    }




    private static void _quicksort (ArrayList<Produkte> list, int leftIndex, int rightIndex, Comparator<Produkte> comparator){
        if ( leftIndex >= rightIndex) {
             return;
        }

        int i = leftIndex;
        int j = rightIndex - 1;
        Produkte pivot = list.get(rightIndex);

        do {
            while( i < rightIndex && comparator.compare(list.get(i), pivot) <= 0){
                i++;
            }
            while (j > leftIndex && comparator.compare(list.get(j), pivot) >= 0){
                j--;
            }
            if (i < j) {
                Produkte temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }

        }while (i < j);

        if (comparator.compare(list.get(i), pivot) > 0) {
            Produkte temp = list.get(i);
            list.set(i, list.get(rightIndex));
            list.set(rightIndex, temp);
        }

        _quicksort(list, leftIndex, i - 1, comparator );
        _quicksort(list, i +1 , rightIndex, comparator);


    }




























    /* public  void quicksort (ArrayList<Produkte> list, int links, int rechts, Comparator<Produkte> comparator){

        Produkte temp;
        int i;
        int j;
        Produkte pivot;

        if (rechts > rechts){
            i = links- 1;
            j = rechts;
            pivot = list.get(rechts);

            while (rechts >= links){
                do {
                    i++;
                }while(comparator.compare(list.get(i), pivot) < 0);

                do {
                    j--;
                }while (comparator.compare(list.get(j), pivot) > 0);

                if ( i >=j){
                    i = list.indexOf(pivot);

                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
            temp = list.get(i);
            list.set(i, list.get(rechts));
            list.set(rechts,temp);
            quicksort(list, links, i - 1, comparator );
            quicksort(list, i + 1, rechts, comparator);
        }
    }
*/
}





