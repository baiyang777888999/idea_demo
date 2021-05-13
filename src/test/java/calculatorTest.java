import org.junit.Assert;
import org.junit.Test;

public class calculatorTest {

    @Test
    public void sum() throws IllegalAccessException, ClassNotFoundException, InstantiationException {

        calculator calculator = new calculator();
        int res = calculator.compute(1,1,"Sum");
        int real = 2;
        Assert.assertEquals(res,real);
    }

    @Test
    public void sub() throws IllegalAccessException, ClassNotFoundException, InstantiationException {

        calculator calculator = new calculator();
        int res = calculator.compute(1,1,"Sub");
        int real = 0;
        Assert.assertEquals(res,real);
    }

}