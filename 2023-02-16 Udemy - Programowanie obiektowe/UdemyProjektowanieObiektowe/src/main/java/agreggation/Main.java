package agreggation;

public class Main {
    public static void main(String[] args){

        Worker w = new Worker("Minorowski", new Address("Kreta", 3));


        System.out.println(w);

        class Slacker {

        }
    }
}

class Worker{
    String name;
    Address address;                                            //Agregacja - łączenie się w całość -
                                                                // klasa Worker zawiera całą klase Adress

    public Worker(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Work work;                                     Kompozycja - praca nie moze istniec bez pracownika

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address{
    String street;
    int homeNumber;



    public Address(String street, int homeNumber){
        this.street = street;
        this.homeNumber = homeNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", homeNumber=" + homeNumber +
                '}';
    }
}
