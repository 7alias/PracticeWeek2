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
        if (a>b){return a;} else return b;

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
        return a+a+b+b;
    }
}
