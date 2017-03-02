package TASKs_DONE.task_7;

/**
 * Created by Admin on 21.02.2017.
 */
public class GenOfStringArray {
    public static String[] stringGen(int arrlength) {
        String strArr[] = new String [arrlength];
        String str;

        for (int i = 0; i < strArr.length; i++) {
            String num = "0";
            for (int j = 0; j < 1; j++) {//задаем длину отдельной строки

                String mathRand = String.valueOf( (int) (Math.random() * 10));
                //System.out.println(mathRand);
                num += mathRand;
            }
            //System.out.println("cycle " + i + " num is " + num);
            str = String.valueOf(num);
            strArr[i] = str;
        }
        return strArr;
        //test of string array
//        for (int i = 0; i < strArr.length; i++) {
//            System.out.println(strArr[i]);
//        }


    }
}
