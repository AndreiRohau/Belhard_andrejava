package els3.myExceptClass;

/**
 * Created by rohau.andrei on 26.04.2017.
 */
public class Main {
    public static void main(String[] args){

        try{
            int result = Factorial.getFactorial(0);
            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}
