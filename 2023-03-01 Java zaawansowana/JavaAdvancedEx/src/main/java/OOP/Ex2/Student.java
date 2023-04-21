package OOP.Ex2;

public class Student extends Person {
    private String typeOfStudies;
    private int yearOfStudies;
    private double costOfStudies;

    public Student(String typeOfStudies, int yearOfStudies, double costOfStudies){
        super();
        this.typeOfStudies = typeOfStudies;
        this.yearOfStudies = yearOfStudies;
        this.costOfStudies = costOfStudies;
    }

    public String getTypeOfStudies(){
        return typeOfStudies;
    }

    public int getYearOfStudies(){
        return yearOfStudies;
    }

    public double getCostOfStudies(){
        return costOfStudies;
    }

    public void setTypeOfStudies(String typeOfStudies){
        this.typeOfStudies = typeOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies){
        this.yearOfStudies = yearOfStudies;
    }

    public void setCostOfStudies(double costOfStudies){
        this.costOfStudies = costOfStudies;
    }

    @Override
    public String toString(){
        return String.format("name: %s, address: %s, type of studies: %s, year of studies: %d, cost of studies %.2f",
                name, address, typeOfStudies, yearOfStudies, costOfStudies);
    }
}
