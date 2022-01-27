package Task9;

/*Rhombuses (ромб):

         вещественная переменная (double) alpha (левый нижний угол ромба, в градусах).
         вещественная переменная (double) beta (левый верхний угол ромба, в градусах).
         должен быть конструктор, принимающий значения (int a, double alpha, double beta, String color), b = a.
         метод getLargeDiagonal() возвращает double — большую диагональ ромба (формулы есть в интернете, чтобы использовать тригонометрическую функцию,
         используйте Math.cos() или Math.sin(), чтобы перевести градусы в радианы, используйте функцию Math.toRadians());
         метод getColor() возвращает строку — color;
         метод getHeight() возвращает double — высоту ромба;
         метод getArea() возвращает double — площадь ромба;
         метод getPerimeter() возвращает double — периметр ромба.
*/


public class Rhombuses extends Quadrangle implements Figure {
    double alpha;
    double beta;

    public Rhombuses(int a, double alpha, double beta, String color) {

        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;

    }

    @Override
    public double area() {
        return a * getHeight();
    }

    @Override
    public double perimeter() {
        return a * 4;
    }

    @Override
    double getLargeDiagonal() {
        return a * Math.sqrt(2 + 2 * Math.cos(Math.toRadians(alpha)));
    }

    @Override
    double getHeight() {
        if (alpha<beta)
        return a*Math.sin(Math.toRadians(alpha));
        else return a*Math.sin(Math.toRadians(beta));
    }

    @Override
    String getColor() {
        return super.color;
    }
}
