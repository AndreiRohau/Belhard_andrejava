package tasksDone.task18;

/**
 * Created by rohau.andrei on 28.04.2017.
 */
public class Rectangle extends Shape implements Colorable {
    private int A;
    private int B;

    public Rectangle(Color color, int A, int B) {
        this.A = A;
        this.B = B;
        super.color = color;
    }

    @Override
    int square() {
        int square;
        square = this.A * this.B;
        return square;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
