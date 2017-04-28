package task18;

/**
 * Created by rohau.andrei on 28.04.2017.
 */
public class Circle extends Shape implements Colorable {

    private int R;

    public Circle(Color color, int R) {
        this.R = R;
        super.color = color;
    }

    @Override
    int square() {
        int square;
        square = (int) (this.R * 2 * 3.14);
        return square;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
