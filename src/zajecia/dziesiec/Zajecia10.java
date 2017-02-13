package zajecia.dziesiec;

import zajecia.dziewiec.Address;
import zajecia.dziewiec.User;

import java.util.HashMap;

public class Zajecia10 {
    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder();
//        HashMap<String, User> osoba=new HashMap<>();
//        osoba.put("213124221", new User("Arek","POdsff","erewqewrfdas"));
//        osoba.put("53253", new User("tewwt","POdtetewtsff","gdsgsdg"));
//        osoba.forEach((k, v)->{
//            System.out.println(k);
//            System.out.println(v);
//            System.out.println();
//
//        });
//        Klient klient1 = new Klient("Arek", "Plumbaum");
//        klient1.setNumertelfonu("2131231");
        Towar pomidor = new Towar("Pomidor", "czerwony", 3.90);
        Towar marchewka = new Towar("Marchewka", "pomaranczowa", 2.12);
        Towar kalafior = new Towar("Kalafior", "zielony", 4.12);
        HashMap<Towar, Integer> produkt =new HashMap<>();
        produkt.put(pomidor,300);
        produkt.put(marchewka,400);
        produkt.put(kalafior,200);
        Magazyn magazyn = new Magazyn(produkt);
        HashMap<Towar, Integer> towarIntegerHashMap = magazyn.get(pomidor, 200);
        System.out.println(towarIntegerHashMap);

//        Zamowienie zamowienie = new Zamowienie(klient1,produkt );
//        System.out.println(klient1);
//        System.out.println(produkt);
//        System.out.println("Cena calkowita za zamowienie to: "+ (float)zamowienie.getCena());



//        Klient klient1 = new Klient("Arkadiusz","Plumbaum");
//        Klient klient2 = new Klient("Jan", "Kowalski",new Address("Poznan","marcelinska",102,"65-234","Polska" ),"+4324412");
//
//        Towar pomidor = new Towar("Pomidor", "czerwony", 3.90);
//        Towar marchewka = new Towar("Marchewka", "pomaranczowa", 2.12);
//        Towar kalafior = new Towar("Kalafior", "zielony", 4.12);
//
//        System.out.println(pomidor);
//        System.out.println(klient1);
//        System.out.println(klient2);


    }


}
