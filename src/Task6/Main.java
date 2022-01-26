package Task6;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Vector2D vector2D = new Vector2D(1, 1, 2, 2);
        Vector2D vector2 = new Vector2D(1, 1, 7, 3);
        Method[] methods = Vector3D.class.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        Vector3D vector3D = new Vector3D(0, 0, 0, 1, 1, 1);
        Vector3D vector3D1 = new Vector3D(0, 0, 0, 3, 2, 0);
        System.out.println("vector2D Length: " + vector2D.getLength());
        System.out.println("vector2 length: "+ vector2.getLength());
        System.out.println("vector3D length: "+vector3D.getLength());
        System.out.println("Coords 2D: " + vector2D.getVectorCords());
        System.out.println("Coords 3D: " + vector3D.getVectorCords());
        System.out.println("Angle 2D/2D: " + vector2D.getAngle(new Vector2D(0, 1, 0, 2)));
        System.out.println("2D scalar: " + vector2D.getScalarProduct(vector2));
        System.out.println("3D scalar: " + vector3D.getScalarProduct(vector3D1));

    }
}