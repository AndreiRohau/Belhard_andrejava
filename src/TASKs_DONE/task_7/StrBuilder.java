package TASKs_DONE.task_7;

/**
 * Created by Admin on 21.02.2017.
 */
public class StrBuilder {
    //StringBuilder
    public static void strBuildr (String [] arr) {
        StringBuilder sb = new StringBuilder("someBuildng ");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);

        }
//        System.out.println("Builder is : " + sb);

    }

}
