package Task9;
/*        Rectangle (прямоугольник):
        должен быть конструктор, принимающий значения (int a int b, String color);
        метод getLargeDiagonal() возвращает double — диагональ прямоугольника (для этого можно использовать Math.sqrt() и Math.max());
        метод getColor() возвращает строку — color;
        метод getHeight() возвращает double — меньшую высоту прямоугольника (это либо a, либо b);
        метод getArea() возвращает double — площадь прямоугольника;
        метод getPerimeter() возвращает double — периметр прямоугольника.  */

public class Rectangle extends Quadrangle implements Figure {

    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return a+a+b+b;
    }

    @Override
    double getLargeDiagonal() {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    @Override
    double getHeight() {
        if (a<b){return a;} else return b;
    }

    @Override
    String getColor() {
        return color;
    }


}
