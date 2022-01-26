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
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    double getLargeDiagonal() {
        return 0;
    }

    @Override
    double getHeight() {
        return 0;
    }

    @Override
    String getColor() {
        return null;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }
}
