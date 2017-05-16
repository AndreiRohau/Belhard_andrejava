package els3.myExcptClass;

/**
 * Created by rohau.andrei on 16.05.2017.
 */
class FactorialException extends Exception{

    private int number;
    public int getNumber(){return number;}

    public FactorialException(String message, int num){
        super(message);
        number=num;
    }

}