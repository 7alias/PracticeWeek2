package Task9;
// Создайте классы, которые должны быть наследниками класса Quadrangle и реализовывать интерфейс Figure, у каждого класса реализуйте нахождение его периметра, площади, диагонали, высоты.

//   Создайте перечисленные ниже классы.
 /*конструктор, принимающий значения (int a, String color), сторона b = a;
        метод getLargeDiagonal() возвращает double — диагональ квадрата (надо посчитать);
        метод getColor() возвращает строку — color;
        метод getHeight() возвращает double — высоту квадрата (просто a);
        метод getArea() возвращает double — площадь квадрата;
        метод getPerimeter() возвращает double — периметр квадрата.*/

public class Square extends Quadrangle implements Figure {
    public Square(int a, String color) {
        super(a, a, color);
    }


    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 0;
    }


    public double getPerimeter() {
        return a*4;
    }

    @Override
    double getLargeDiagonal() {
        return Math.sqrt(2*a);
    }

    @Override
    double getHeight() {
        return a;
    }

    @Override
    String getColor() {
        return null;
    }

    @Override
    double getArea() {
        return 0;
    }
}
