package Task9;

/*Rhombuses (ромб):

         вещественная переменная (double) alpha (левый нижний угол ромба, в градусах).
         вещественная переменная (double) beta (левый верхний угол ромба, в градусах).
         должен быть конструктор, принимающий значения (int a, double alpha, double beta, String color), b = a.
         метод getLargeDiagonal() возвращает double — большую диагональ ромба (формулы есть в интернете, чтобы использовать тригонометрическую функцию, используйте Math.cos() или Math.sin(), чтобы перевести градусы в радианы, используйте функцию Math.toRadians());
         метод getColor() возвращает строку — color;
         метод getHeight() возвращает double — высоту ромба;
         метод getArea() возвращает double — площадь ромба;
         метод getPerimeter() возвращает double — периметр ромба.
*/
public class Rhombuses extends Quadrangle implements Figure {
    public Rhombuses(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return a+a+b+b;
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
