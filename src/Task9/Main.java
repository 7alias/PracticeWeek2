package Task9;

public class Main {
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(1, 2, 60, 120, "Pink");
        Parallelogram parallelogram2 = new Parallelogram(1, 2, 90, 90, "White");


        System.out.println(parallelogram2.getColor());//("White")
        System.out.println(parallelogram2.getHeight()); //== 1
        System.out.println(parallelogram2.getLargeDiagonal()); //>= 2.23
        System.out.println(parallelogram2.area());// == 2 &&
        System.out.println(parallelogram2.perimeter()); // == 6 &&
    }
}
