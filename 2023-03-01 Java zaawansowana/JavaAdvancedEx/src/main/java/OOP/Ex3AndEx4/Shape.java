package OOP.Ex3AndEx4;

public abstract class Shape {

    protected String colour;
    protected boolean isFilled;


    public Shape() {
        this.colour = "unknown";
        this.isFilled = false;
    }

    public Shape(String colour, boolean isFilled){
        this.colour = colour;
        this.isFilled = isFilled;
    }

    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean isFilled){
        this.isFilled = isFilled;
    }

    @Override
    public String toString(){
        return String.format("Shape with colour of %s and %s", colour, isFilled ? "is filled." : "is not filled." );
    }

    public abstract double getArea();

    public abstract double getPerimeter();



}


