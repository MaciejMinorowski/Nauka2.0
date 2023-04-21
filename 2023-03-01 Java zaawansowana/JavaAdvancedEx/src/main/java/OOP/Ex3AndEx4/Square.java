package OOP.Ex3AndEx4;

public class Square extends Rectangle {

    public Square(){
        super();
    }

    public Square(String colour, boolean isFilled, double size){
        super(colour, isFilled, size, size);

    }

    @Override
    public void setLength(double length){
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString(){
        return String.format("Square with width = %.2f and length = %.2f which is a subclass of %s",
                width, length, super.toString());
    }


}
