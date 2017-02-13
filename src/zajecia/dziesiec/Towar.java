package zajecia.dziesiec;


public class Towar {
    private String nazwa;
    private String opis;
    private double cena;


    public String toString() {
        return "[" + nazwa + ", " + opis + ", " + cena + "]";
    }

    public Towar(String nazwa) {
        this.nazwa = nazwa;
    }

    public Towar(String nazwa, String opis, double cena) {
        this(nazwa);
        this.opis = opis;
        this.cena = cena;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public double getCena() {
        return cena;
    }
}
