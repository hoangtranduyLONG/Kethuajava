package Loppoin2dva3d;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(4.5f, 5.5f);
        point2D.setX(4.7f);
        point2D.setY(8.0f);
        System.out.println(point2D);

        Point3D point3D = new Point3D(4.5f ,6.3f , 5.0f);
        System.out.println(point3D);

        Ooppoint point = new Ooppoint(4.6f,5.6f,6.8f,5.6f);
        System.out.println(point.move());

        Ooppoint point1 = new Ooppoint(5.0f,6.0f,7.0f,8.0f);
        System.out.println(point1.move());

    }
}
