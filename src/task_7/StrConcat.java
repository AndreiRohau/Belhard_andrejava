package task_7;

/**
 * Created by Admin on 21.02.2017.
 */
public class StrConcat {
    //конкатенация
    public static void strConcat (String [] arr) {
        String sc = "some_String ";

        for (int i = 0; i < arr.length; i++) {
            sc += arr[i];

        }
//        System.out.println("Concat  is : " + sc);
    }

}
