import java.time.LocalDate;

public class Produkte {

    String name;
    int anzahl;
    String art;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    LocalDate date;

    public Produkte(String name, int anzahl, String art, LocalDate date) {
        this.name = name;
        this.anzahl = anzahl;
        this.art = art;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }


    }



