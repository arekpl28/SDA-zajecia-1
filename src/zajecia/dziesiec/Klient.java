package zajecia.dziesiec;


import zajecia.dziewiec.Address;

public class Klient {
    private String imie;
    private String nazwisko;
    private Address adres;
    private String numertelfonu;

    public String toString() {
        return "[" + imie + " " + nazwisko + ", " + numertelfonu + "]";
    }

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Klient(String imie, String nazwisko, Address adres, String numertelfonu) {
        this(imie, nazwisko);
        this.adres = adres;
        this.numertelfonu = numertelfonu;
    }

    public void setAdres(Address adres) {
        this.adres = adres;
    }

    public void setNumertelfonu(String numertelfonu) {
        this.numertelfonu = numertelfonu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Address getAdres() {
        return adres;
    }

    public String getNumertelfonu() {
        return numertelfonu;
    }
}
