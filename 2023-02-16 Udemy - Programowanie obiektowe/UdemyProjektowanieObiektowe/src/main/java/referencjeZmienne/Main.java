package referencjeZmienne;

public class Main {
    public static void main(String[] args) {

        int a = 53;
        int b = a;

        b = 30;

        System.out.println(a);

        Test x = new Test(); //pod x nie znajduje sie wartosc zwykla(prymitywna) TYLKO ADRES - zmienna REFERENCYJNA

        Test y = x;

        y.a = 40;

        System.out.println(x.a); // wyswietla 40, bo x i y maja ten sam adres

        String imie = "Maciek";

        String imie2 = imie;                // Tak działa String, obie operacje wykonuja to samo,
        String imie3 = new String(imie);    // pod tym wzgledem String jest wyjatkowy
                                            // Czyli poniekąd String zachowuje się jak typ prymitywny - ale pozornie

        System.out.println(imie2);

        imie2 = "Tomek";

        System.out.println(imie2);
        System.out.println(imie);


    }
}

class Test {

    int a = 20;
}


