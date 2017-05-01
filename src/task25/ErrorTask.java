package task25;

import java.io.FileNotFoundException;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;

/**
 * Created by rohau.andrei on 29.04.2017.
 */
public class ErrorTask {

    private LinkedList<Throwable> errorList;

    public ErrorTask(){
        errorList = setErrorList();
    }

    public LinkedList<Throwable> setErrorList() {
        LinkedList<Throwable> errorList= new LinkedList<>();
        errorList.add(new NullPointerException());
        errorList.add(new OutOfMemoryError());
        errorList.add(new StackOverflowError());
        errorList.add(new FileNotFoundException());
        errorList.add(new ClassCastException());
        errorList.add(new IndexOutOfBoundsException());
        errorList.add(new ConcurrentModificationException());
        errorList.add(new NoSuchFieldException());
        return errorList;
    }

    public LinkedList<Throwable> getErrorList() {
        return errorList;
    }
}
