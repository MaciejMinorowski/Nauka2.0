package OOP.Ex2;

public class Person {

    protected String name, address;

    public Person(){
        this.name = "";
        this.address = "";
    }

    public Person(String name, String address){
        this.address = address;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return String.format("%s->%s", name, address);
    }




}
