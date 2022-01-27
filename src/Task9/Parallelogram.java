package Task9;

  /* Parallelogram (параллелограмм):

           вещественная переменная (double) alpha (левый нижний угол параллелограмма в градусах);
           вещественная переменная (double) beta (левый верхний угол параллелограмма в градусах);
           должен быть конструктор, принимающий значения (int a, int b, double alpha, double beta, String color);
           метод getLargeDiagonal() возвращает double — большую диагональ параллелограмма (формулы есть в интернете, чтобы использовать тригонометрическую функцию, используйте Math.cos() или Math.sin());
           метод getColor() возвращает строку — color;
           метод getHeight() возвращает double — МЕНЬШУЮ высоту параллелограмма;
           метод getArea() возвращает double — площадь параллелограмма;
           метод getPerimeter() возвращает double — периметр параллелограмма.
*/

public class Parallelogram extends Quadrangle implements Figure {
    double alpha;
    double beta;

    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }


    @Override
    public double area() {
        if (a > b) {
            return a * getHeight();
        } else return b * getHeight();
    }

    @Override
    public double perimeter() {
        return a + a + b + b;
    }

    @Override
    double getLargeDiagonal() {
        if (beta > alpha)
            return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) - 2 * a * b * Math.cos(Math.toRadians(beta)));
        else return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) - 2 * a * b * Math.cos(Math.toRadians(alpha)));
    }

    @Override
    double getHeight() {
        if (alpha <= beta && a < b) return a * Math.sin(Math.toRadians(alpha));
        else if (alpha >= beta && a < b) return a * Math.sin(Math.toRadians(beta));
        else if (alpha <= beta && b < a) return b * Math.sin(Math.toRadians(alpha));
        else return b * Math.sin(Math.toRadians(beta));
    }

    @Override
    String getColor() {
        return super.color;
    }


}
