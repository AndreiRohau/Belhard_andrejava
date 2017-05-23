package els3.serializableTest;

import java.io.*;

/**
 * Created by rohau.andrei on 23.05.2017.
 */
public class Counter implements Serializable, Runnable{
    private int value;
    private String name;
    transient private Thread myThread;

    public Counter(int value, String name){
        this.value = value;
        this.name = name;
        startTheThread();
    }

    @Override
    public String toString(){
        return name + " " + value;
    }

    public void run(){
        while(true){
            System.out.println(name + "--->" + value);
            value++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }

        }
    }

    public void startTheThread(){
        myThread = new Thread(this);
        myThread.start();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
//        out.defaultWriteObject();

        throw new NotSerializableException("dont want to write");
    }
    private void readObject(ObjectInputStream inp) throws IOException, ClassNotFoundException {
//        inp.defaultReadObject();
//        startTheThread();

        throw new NotSerializableException("dont want to read");
    }

}
