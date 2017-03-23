package els3.tuesday_17_01_2017;

/**
 * Created by Admin on 17.01.2017.
 */
public class Constructor<P1, P2, P3> {
    P1 obj1;
    P2 obj2;
    P3 obj3;

    public Constructor(P1 obj1, P2 obj2, P3 obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public P1 getObj1() {
        return obj1;
    }

    public void setObj1(P1 obj1) {
        this.obj1 = obj1;
    }

    public P2 getObj2() {
        return obj2;
    }

    public void setObj2(P2 obj2) {
        this.obj2 = obj2;
    }

    public P3 getObj3() {
        return obj3;
    }

    public void setObj3(P3 obj3) {
        this.obj3 = obj3;
    }
}
