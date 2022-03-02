import org.junit.Assert;
import org.junit.Test;
import static com.company.Main.canBeDividedBy3;
import static com.company.Main.generateNumbers;

public class UnitTests {
    @Test
    public void isDivisibleBy3() {
        int multipleOf3 = 6;
        Assert.assertTrue(canBeDividedBy3(multipleOf3));
    };
    @Test
    public void isNotDivisibleBy3() {
        int notMultipleOf3 = 91;
        Assert.assertFalse(canBeDividedBy3(notMultipleOf3));
    };
    @Test
    public void arrayHasRightSize() {
        int valueForArray=10;
        int size = generateNumbers(valueForArray).size();
        Assert.assertTrue(size==valueForArray-1);
    }
}
