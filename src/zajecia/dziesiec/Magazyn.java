package zajecia.dziesiec;


import java.util.HashMap;

public class Magazyn {
    private HashMap<Towar, Integer> magazyn;

    public Magazyn(HashMap<Towar, Integer> magazyn) {
        this.magazyn = magazyn;
    }

    public boolean mamyIlosc(Towar towar, Integer ilosc) {
        boolean returnValue = false;
        if (magazyn.containsKey(towar)) {
            Integer iloscMagazyn = magazyn.get(towar);
            returnValue = iloscMagazyn >= ilosc;
        }
        return returnValue;
    }

    public void add(Towar towar, int ilosc) {
        if (magazyn.containsKey(towar)) {
            Integer iloscWMagazynie = magazyn.get(towar);
            magazyn.put(towar, iloscWMagazynie + ilosc);
        } else {
            magazyn.put(towar, ilosc);
        }
    }

    public HashMap<Towar, Integer> get(Towar towar, Integer ilosc) {
        if (!mamyIlosc(towar, ilosc)) {
            System.out.println("Brak towaru");
            return new HashMap<>();
        }
        Integer iloscWMagazynie = magazyn.get(towar);
        magazyn.put(towar, iloscWMagazynie - ilosc);

        HashMap<Towar, Integer> towary = new HashMap<>();
        towary.put(towar, ilosc);
        return towary;
    }
}
