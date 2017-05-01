package tasksDone.task18;

/**
 * Created by rohau.andrei on 28.04.2017.
 */
public class Square extends Shape implements Colorable {
    private int A;

    public Square(Color color, int A) {
        this.A = A;
        super.color = color;
    }

    @Override
    int square() {
        int square;
        square = this.A * this.A;
        return square;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
