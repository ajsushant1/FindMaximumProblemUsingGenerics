import com.bridgelabz.findmaximum.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void givenThreeIntegers_WhenMaximumAtFirst_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximumInteger = findMaximum.getMaximumInteger(10,8,9);
        Assert.assertEquals((Integer) 10, maximumInteger);
    }
}
