package task18;

import java.util.logging.Logger;

import static task18.Color.*;

/**
 *      Сделать иерархию Shape, Circle, Rectangle, Square,
 *      у Shape Должен быть абстрактный метод square() который возвращает площадь фигуры.
 *      Shape - класс с одним параметром(Color color),
 *      Circle(color, R), Rectangle(color, a, b), Square (color, a).
 *      Color - enum у которого надо задать возможные цвета для фигуры.
 *      Сделать интерфейс Colorable с методом getColor(Color color) который возвращает цвет фигуры.
 * В мейн методе должны быть созданы фигуры и вызван метод square, который вернет площадь фигуры,
 * а также нужно получить цвет созданной фигуры
 */
public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Circle c1 = new Circle(Black, 5);
        log.info(String.valueOf(c1.square()));
        log.info(String.valueOf(c1.getColor()));

        Rectangle r1 = new Rectangle(Green, 3,4);
        log.info(String.valueOf(r1.square()));
        log.info(String.valueOf(r1.getColor()));

        Square s1 = new Square(Red, 2);
        log.info(String.valueOf(s1.square()));
        log.info(String.valueOf(s1.getColor()));




    }
}
