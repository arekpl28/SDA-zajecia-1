package zajecia.dziesiec;

import java.util.*;

public class Zamowienie {
    private HashMap<Towar, Integer> koszyk;
    private Klient klient;
    private Date data;
    private double cena;

    public Zamowienie(Klient klient, HashMap<Towar, Integer> koszyk) {
        this.klient = klient;
        this.koszyk = koszyk;
        this.data = new Date();
        this.cena = wycena();
    }

    public Zamowienie dodajDoZamowienia(Towar towar, int ilosc) {
        if (koszyk.containsKey(towar)) {
            Integer iloscWKoszyku = koszyk.get(towar);
            koszyk.put(towar, iloscWKoszyku + ilosc);
        } else {
            koszyk.put(towar, ilosc);
        }
        return this;
    }

    public double koniec(){
        return wycena();
    }

    private double wycena() {
        Set<Map.Entry<Towar, Integer>> entries = koszyk.entrySet();
        Iterator<Map.Entry<Towar, Integer>> iterator = entries.iterator();
        double calkowitaCena = 0;
        while (iterator.hasNext()) {
            Map.Entry<Towar, Integer> next = iterator.next();
            Towar towar = next.getKey();
            Integer ilosc = next.getValue();
            double cena = towar.getCena();
            calkowitaCena += ilosc * cena;
        }
        return calkowitaCena;
    }

    public HashMap<Towar, Integer> getKoszyk() {
        return koszyk;
    }

    public Klient getKlient() {
        return klient;
    }

    public Date getData() {
        return data;
    }

    public double getCena() {
        return cena;
    }
}
