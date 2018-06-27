import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    private SimpleDateFormat parser = new SimpleDateFormat();


    public static void main(String[] args) {


        ArrayList<Produkte> list = new ArrayList<>();
        Produkte p1 = new Produkte("AA", 5, "Obst", LocalDate.of(2014, 3, 15));
        System.out.println(p1.getDate());
        Produkte p2 = new Produkte("AB", 9, "Obst", LocalDate.of(2014, 3, 15));
        Produkte p3 = new Produkte("Karotten", 30, "Gemüse", LocalDate.of(2014, 4, 11));
        Produkte p4 = new Produkte("Salatkopf", 31, "Gemüse", LocalDate.of(2017, 3, 15));
        Produkte p5 = new Produkte("Rindsteak", 32, "Fleisch", LocalDate.of(2014, 4, 10));
        Produkte p6 = new Produkte("Cindsteak", 41, "Fleisch", LocalDate.of(2018, 3, 15));
        Produkte p7 = new Produkte("Dindsteak", 4, "Fleisch", LocalDate.of(2016, 3, 18));
        Produkte p8 = new Produkte("Findsteak", 3, "Fleisch", LocalDate.of(2014, 3, 15));
        Produkte p9 = new Produkte("Eindsteak", 4, "Fleisch", LocalDate.of(2015, 3, 15));

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p9);
        list.add(p7);
        list.add(p8);
        list.add(p5);
        list.add(p6);

        System.out.println("Nicht sortiert: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Name: " + list.get(i).getName() + ", " + "Anzahl " + list.get(i).getAnzahl() + ", " + "Art: " + list.get(i).getArt()  + ", " + "Datum: " + list.get(i).getDate());;
        }


        Quicksort quicksort = new Quicksort();
        quicksort.namequicksort(list);

        System.out.println(" ");
        System.out.println("Name sortiert: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Name: " + list.get(i).getName() + ", " + "Anzahl " + list.get(i).getAnzahl() + ", " + "Art: " + list.get(i).getArt()  + ", " + "Datum: " + list.get(i).getDate());;
        }


        quicksort.datequicksort(list);

        System.out.println(" ");
        System.out.println("Datum sortiert: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Name: " + list.get(i).getName() + ", " + "Anzahl " + list.get(i).getAnzahl() + ", " + "Art: " + list.get(i).getArt()  + ", " + "Datum: " + list.get(i).getDate());

        }

        quicksort.artquicksort(list);

        System.out.println(" ");
        System.out.println("Art sortiert: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Name: " + list.get(i).getName() + ", " + "Anzahl " + list.get(i).getAnzahl() + ", " + "Art: " + list.get(i).getArt()  + ", " + "Datum: " + list.get(i).getDate());

        }

        quicksort.anzahlquicksort(list);

        System.out.println(" ");
        System.out.println("Anzahl sortiert: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Name: " + list.get(i).getName() + ", " + "Anzahl " + list.get(i).getAnzahl() + ", " + "Art: " + list.get(i).getArt()  + ", " + "Datum: " + list.get(i).getDate());

        }
    }
}

