package operatorsShield;

/**
 * Created by Admin on 29.01.2017.
 */
public class ForWithoutBody {
    public static void main(String[] args) {
        WithoutBody();
    }

    public static void WithoutBody(){
        int i, sum = 0;
        for(i = 0; i < 5; sum += i++){
            System.out.println(sum + "  " + i);
        }
        System.out.println(sum);
    }
}
