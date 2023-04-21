package OOP.Ex6;

public class MovablePoint implements Movable {


    private int x, y ;
    int speedY, speedX;


    public MovablePoint(int x, int y, int speedY, int speedX) {
        this.x = x;
        this.y = y;
        this.speedY = speedY;
        this.speedX = speedX;
    }

    @Override
    public void moveUp() {
        y = y + speedY;
    }

    @Override
    public void moveDown() {
        y = y - speedY;
    }

    @Override
    public void moveLeft() {
        x = x - speedX;
    }

    @Override
    public void moveRight() {
        x = x + speedX;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", speedY=" + speedY +
                ", speedX=" + speedX +
                '}';
    }
}
