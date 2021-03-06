package Loppoin2dva3d;

public class Ooppoint  extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public Ooppoint(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public Ooppoint(float x, float y, float xSpeed , float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return " MoveablePoint{ " +
                " x " + super.getX() +
                " xSpeed = " + super.getY() +
                " xSpeed = " + xSpeed +
                " , ySpeed = " + ySpeed +
                '}';
    }

    public Ooppoint move() {
        float x = super.getX();
        float y = super.getY();
        x += this.xSpeed;
        y += this.ySpeed;
        setX(x);
        setY(y);
        return this;
    }
}
