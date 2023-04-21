package metodyOverloading;


// Funkcje, a metody
// Funkcja znajduje się poza klasą, a metoda to funkcja znajdująca się wewnątrz klasy
// W Javie nie ma stricte funkcji bo wszystkie zamknięte są w klasach.
// Funkcje występują np w C++

public class Main {
    public static void main(String[] args){

        Test a = new Test();

        a.wypisz("Arek");

        int wynik = a.dodaj(10,5);
        System.out.println(wynik);

    }
}


class Test {
    void wypisz(String text){
        System.out.println(text);
    }

    int dodaj(int a, int b){
        return a + b ;
    }

    // Przeciężenie metody:

    double dodaj(double a, double b){
        return a + b ;
    }



}
