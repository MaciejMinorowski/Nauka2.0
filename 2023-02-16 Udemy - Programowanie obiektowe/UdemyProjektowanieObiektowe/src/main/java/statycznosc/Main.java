package statycznosc;

public class Main {
    public static void main(String[] args){

        // Matematyka test = new Matematyka();  tak wyglada jesli metoda "dodaj" jest niestatyczna
        // double wynik = test.dodaj(10,20);

        double wynik = Matematyka.dodaj(10, 50);
        System.out.println(wynik);

        System.out.println(Matematyka.pi);
        System.out.println();


        Klient a = new Klient("Maciej");
        Klient b = new Klient("Tomasz");
        Klient c = new Klient("Damian");


        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);


    }
}


class Matematyka {

    static final double pi = 3.14;                  // Statyczne pole = pozwala bezpośrednio odwołać się do wartości bez
                                                    // konieczności tworzenia obiektu klasy
    static double dodaj(double a, double b){        // Statyczna metoda
        return a + b;
    }
}

class Klient {

    String imie;
    int id = 0;
    static int nastepnyId = 0;                      // Ciekawostka, użycie stałego pola klasy aby generować kolejne
                                                    // numery id = samo id pozostaje niestatyczne, statyczny jest
                                                    // modyfikator "nastepny id" ktory rośnie wraz z każdym kolejnym
                                                    // użyciem konstruktora


    Klient(String imie){
        this.imie = imie;
        nastepnyId++;
        id = nastepnyId;
    }
}