package OOP.Ex6;

public class MovableCircle implements Movable{

    private MovablePoint movablePoint;
    private double radius;

    public MovableCircle(MovablePoint movablePoint, double radius) {
        this.movablePoint = movablePoint;
        this.radius = radius;
    }

    public MovableCircle(int x, int y, int speedX, int speedY, double radius){
        this.radius = radius;
        this.movablePoint = new MovablePoint(x, y, speedX, speedY);
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "movablePoint=" + movablePoint +
                ", radius=" + radius +
                '}';
    }
}
