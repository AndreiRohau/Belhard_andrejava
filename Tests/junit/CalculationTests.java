package junit;

import els3.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;


public class CalculationTests {

    @Test
    public void shouldSumTwoNumbers() {

        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.summ(1, 5);

        //then
        Assert.assertEquals(6, result);
    }

    @Test
    public void shouldDivideNumbersWithNonCommonResult() {

        Calculator calculator = new Calculator();
        int result = calculator.div(10, 6);

        Assert.assertEquals(2, result);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldNotBeDivByZero() {

        Calculator calculator = new Calculator();
        int result = calculator.div(10, 0);

        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldDivideZero() {

        Calculator calculator = new Calculator();
        int result = calculator.div(0, 10);

        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldBeDivWithBiggerNumber() {

        Calculator calculator = new Calculator();
        int result = calculator.div(2, 10);

        Assert.assertEquals(1, result);
    }

    @Test
    public void NormalDivision() {

        Calculator calculator = new Calculator();
        int result = calculator.div(10, 2);

        Assert.assertEquals(5, result);
    }




}
