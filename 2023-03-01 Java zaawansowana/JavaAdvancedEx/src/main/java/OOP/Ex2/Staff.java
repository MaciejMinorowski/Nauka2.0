package OOP.Ex2;

public class Staff extends Person {
    private String specialisation;
    private double salary;

    public Staff(String specialisation, double salary){
        super();
        this.specialisation = specialisation;
        this.salary = salary;
    }

    public String getSpecialisation(){
        return specialisation;
    }

    public double getSalary(){
        return salary;
    }

    public void setSpecialisation(String specialisation){
        this.specialisation = specialisation;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return String.format("name: %s, address: %s, specialisation: %s, salary: %.2f",
                name, address, specialisation, salary );
    }

}
