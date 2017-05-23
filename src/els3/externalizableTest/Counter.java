package els3.externalizableTest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by rohau.andrei on 23.05.2017.
 */
public class Counter implements Externalizable{
    private int value;
    private String name;
    transient private Thread myThread;

    public Counter(int value, String name){
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " " + value;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String)in.readObject();
    }
}
