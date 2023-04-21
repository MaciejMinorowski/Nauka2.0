package porownywanieStringow;

public class Main {
    public static void main(String[] args) {

        String imie1 = "Maciek";
        String imie2 = "Maciek";

        String imie3 = new String("Tomek"); // przy takim utworzeniu Stringów o tej samej wartosci nie zachodzi optymalizacja,
        String imie4 = new String("Tomek"); // oba Stringi maja rozne adresy wiec nie sa rowne

        if (imie1 == imie2){ // tu porownuja sie adresy, nie ciagi znaków
            System.out.println("są rowne");
        } else {
            System.out.println("NIE są rowne");
        }

        if (imie3 == imie4){
            System.out.println("są rowne");
        } else {
            System.out.println("NIE są rowne");
        }

        if (imie3.equals(imie4)){            //Dlatego uzywamy metody .equals do porownywania Stringow!!!!!
            System.out.println("są rowne");
        } else {
            System.out.println("NIE są rowne");
        }

    }
}
