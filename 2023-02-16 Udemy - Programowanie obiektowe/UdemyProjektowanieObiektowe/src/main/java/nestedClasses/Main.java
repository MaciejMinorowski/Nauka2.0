package nestedClasses;

public class Main {
    public static void main(String[] args) {

        A zewnetrzna = new A();
        A.B tnp = zewnetrzna.new B();

        A.C tmp2 = new A.C();
    }
}


class A{

    A(){
        System.out.println("Jestem z klasy zewn A");
    }

    class B{
        B(){
            System.out.println("Jestem z klasy nested B");
        }
        void sth(){
            test = 5;                                   // brak dostepu do tego pola jesli B zrobilibysmy static
        }                                               // metody static różnią się od metod niestatycznych tym, że
                                                        // nie mogą korzystać z pól i metod niestatycznych

        private int tmp;

    }


    static class C {

        C() {
            System.out.println("Jestem z klasy nested C");
        }
    }

    private int test;

    void sth2(){
        // tmp = 2;                         /Klasa zewnetrzna nie ma dostepu do pol klasy wewnetrznej
    }


}