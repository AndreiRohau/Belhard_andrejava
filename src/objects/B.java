package objects;

public class B {

    private A b; // this.a!!!

    public B(A b) {
        this.b   =  b;
    }

    public A getB() {
        return b;
    }

    public void setB(B a) {
        this.b = b;
    }
}
