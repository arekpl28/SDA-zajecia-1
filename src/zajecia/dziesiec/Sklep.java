package zajecia.dziesiec;

import java.util.HashMap;

public class Sklep {
    private Magazyn magazyn;

    public Sklep(Magazyn magazyn) {
        this.magazyn = magazyn;
    }

    public Magazyn getMagazyn() {
        return magazyn;
    }

    public Zamowienie zlozZamowienie(Klient klient) {
        return new Zamowienie(klient, new HashMap<>());
    }

    public void dodajDoKoszyka(Zamowienie zamowienie, Towar towar, int ilosc) {
        if (magazyn.mamyIlosc(towar, ilosc)) {
            zamowienie.dodajDoZamowienia(towar, ilosc);
        } else {
            System.out.println("Sorry");
        }
    }

    public void koniec(Zamowienie zamowienie) {
        HashMap<Towar, Integer> koszyk = zamowienie.getKoszyk();
        koszyk.forEach((towarWKoszyku, iloscTowaruWKoszyku) -> {
            magazyn.get(towarWKoszyku, iloscTowaruWKoszyku);
        });
        System.out.println(zamowienie.koniec());
    }

}
