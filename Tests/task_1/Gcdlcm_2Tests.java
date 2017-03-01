package task_1;

//найти наименьшее общее кратное и наибольший общий делитель чисел, вводимых с консоли

import org.junit.Assert;
import org.junit.Test;

public class Gcdlcm_2Tests { //Great Common Divisor (herein hereafter as GCD) & Least Common Multiple (hh as LCM)

    @Test
    public void shouldDoSmth (){
        //given
        Gcdlcm_2 gcdlcm_2 = new Gcdlcm_2();

        //when
        int result = 5;

        //then
        Assert.assertEquals(6, result);

    }

    //greatest common divisor method
    public static long gcd(long a,long b) {
        return b == 0 ? a : gcd(b,a % b);
    }

    //least common multiple method
    public static long lcm(long a,long b) {
        return a / gcd(a,b) * b;
    }

}