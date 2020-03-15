import com.bridgelabz.findmaximum.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    FindMaximum findMaximum = new FindMaximum();

    @Test
    public void givenThreeIntegers_WhenMaximumAtFirst_ThenReturnMaximum() {
        Comparable maximumInteger = findMaximum.getMaximumValue(10, 8, 9);
        Assert.assertEquals((Integer) 10, maximumInteger);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumAtMiddle_ThenReturnMaximum() {
        Comparable maximumInteger = findMaximum.getMaximumValue(10, 18, 9);
        Assert.assertEquals((Integer) 18, maximumInteger);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumAtLast_ThenReturnMaximum() {
        Comparable maximumInteger = findMaximum.getMaximumValue(10, 18, 29);
        Assert.assertEquals((Integer) 29, maximumInteger);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtFirst_ThenReturnMaximum() {
        Comparable maximumFloat = findMaximum.getMaximumValue(22.5f, 8.5f, 12.3f);
        Assert.assertEquals((Float) 22.5f, maximumFloat);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtMiddle_ThenReturnMaximum() {
        Comparable maximumFloat = findMaximum.getMaximumValue(2.5f, 18.5f, 12.3f);
        Assert.assertEquals((Float) 18.5f, maximumFloat);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtLast_ThenReturnMaximum() {
        Comparable maximumFloat = findMaximum.getMaximumValue(2.5f, 18.5f, 32.3f);
        Assert.assertEquals((Float) 32.3f, maximumFloat);
    }

    @Test
    public void givenThreeStringsWithLowerCase_WhenMaximumAtFirst_ThenReturnMaximum() {
        Comparable maximumString = findMaximum.getMaximumValue("cat", "bat", "apple");
        Assert.assertEquals("cat", maximumString);
    }

    @Test
    public void givenThreeStringsWithLowerCase_WhenMaximumAtMiddle_ThenReturnMaximum() {
        Comparable maximumString = findMaximum.getMaximumValue("bat", "cat", "apple");
        Assert.assertEquals("cat", maximumString);
    }

    @Test
    public void givenThreeStringsWithLowerCase_WhenMaximumAtLast_ThenReturnMaximum() {
        Comparable maximumString = findMaximum.getMaximumValue("apple", "bat", "cat");
        Assert.assertEquals("cat", maximumString);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtFirst_ThenReturnMaximum() {
        Comparable maximumString = findMaximum.getMaximumValue("CAT", "BAT", "APPLE");
        Assert.assertEquals("CAT", maximumString);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtMiddle_ThenReturnMaximum() {
        Comparable maximumString = findMaximum.getMaximumValue("BAT", "CAT", "APPLE");
        Assert.assertEquals("CAT", maximumString);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtLast_ThenReturnMaximum() {
        Comparable maximumString = findMaximum.getMaximumValue("APPLE", "BAT", "CAT");
        Assert.assertEquals("CAT", maximumString);
    }

    @Test
    public void givenThreeStringsWithUpperCaseAndLowerCase_CompareString_ThenReturnMaximumString() {
        Comparable maximumString = findMaximum.getMaximumValue("APPLE", "bat", "CAT");
        Assert.assertEquals("bat", maximumString);
    }

    @Test
    public void givenThreeNumberAsString_whenCompare_ThenReturnMaximumString() {
        Comparable maximumString = findMaximum.getMaximumValue("5", "8", "3");
        Assert.assertEquals("8", maximumString);
    }

}
