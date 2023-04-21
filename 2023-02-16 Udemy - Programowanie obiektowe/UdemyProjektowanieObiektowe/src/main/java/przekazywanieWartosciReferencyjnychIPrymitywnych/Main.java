package przekazywanieWartosciReferencyjnychIPrymitywnych;

public class Main {
    public static void main(String[] args) {

            int a = 5;

            Test x = new Test();

            a = x.zmienWartosc(a);

            int b = x.zmienWartosc(a);

            System.out.println(a);
            System.out.println(b);

            Foo foo = new Foo();

            x.zmienZawartosc(foo);

            System.out.println(foo.y); // wartosc y zmienia się bo wq metodzie void zmienZawartosc operujemy na adresach


    }
}

        //Parametr - zmienna lokalna istniejąca tylko w zakresie { } klamr.


        //Typ prymitywny
        //Przy przesyłaniu kopii, gdy chcemy zmienić wartość, która jest przesyłana musimy z
        //wrócić zmienioną wartość i przypisać do niej tą zmienioną wartość np:

class Test{

        int zmienWartosc(int zm)
        {
            zm = zm + 2;
            return zm;

        }

        void zmienZawartosc(Foo zm){  // Foo zm =
            zm.y = zm.y + 40;
        }
}

class Foo {
    int y = 20;
}



//          Typ referencyjny:
//          W typie referencyjnym przesyłając wartość tworzy się nowa kopia,
//          która ma ten sam adres jak w pamięci.
//          Edytujemy w tym momencie te same wartości - pod tymi samymi adresami.
//
//          Przesyłanie Stringów:
//          Zachowuje się przy zmianie tak samo jak typ prymitywny. Za każdym razem rezerwowane jest nowe miejsce w pamięci.

