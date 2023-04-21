package pakietyModyfikatoryDostepuEnkapsulacjaGetSet;


/*
           public Class - klasy publiczne dostępne również poza pakietem, aczkolwiek
                          trzeba je zaimportować
 (package-private)Class - klasy pakietowe, dostepne wewnątrz pakietu, nie możemy
                          ich importować do innych pakietów


         private - dostepne tylko z wewnatrz klasy

         protected - dostepne tylko wewnatrz klasy i w klasach dziedziczacych z tej klasy

         enkapsulacja (hermetyzacja) - pakowanie właściwości w taki sposób aby nie było do nich bezpośredniego dostępu
                                        z innych klas

     */


public class Main {
    public static void main(String[] args) {

    KontoBankowe savingAccount = new KontoBankowe();

        System.out.println(savingAccount.getSaldo());

        savingAccount.setSaldo(1_000_000);

        System.out.println(savingAccount.getSaldo());

        savingAccount.wypłata(10000000);

        System.out.println(savingAccount.getSaldo());
    }
}


class KontoBankowe {
    private int saldo;

    public KontoBankowe() {
        saldo = 1000;
    }

    int getSaldo() {
        return saldo;
    }

    boolean setSaldo(int saldo) {

        // Mozesz tu dodać warunki, które mogą zablokować zmiany we właściwościach

        this.saldo = saldo;
        return true;
    }

    boolean wypłata(int ile) {

        if (saldo < ile) {
            return false;
        } else {
            setSaldo(saldo - ile);
            return true;
        }
    }
}