import com.bridgelabz.findmaximum.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void givenThreeIntegers_WhenMaximumAtFirst_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum(10, 8, 9);
        Comparable maximumInteger = findMaximum.getMaximumValue();
        Assert.assertEquals(10, maximumInteger);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumAtMiddle_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum(10, 18, 9);
        Comparable maximumInteger = findMaximum.getMaximumValue();
        Assert.assertEquals(18, maximumInteger);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumAtLast_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum(10, 18, 29);
        Comparable maximumInteger = findMaximum.getMaximumValue();
        Assert.assertEquals((Integer) 29, maximumInteger);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtFirst_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum(22.5f, 8.5f, 12.3f);
        Comparable maximumFloat = findMaximum.getMaximumValue();
        Assert.assertEquals(22.5f, maximumFloat);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtMiddle_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum(2.5f, 18.5f, 12.3f);
        Comparable maximumFloat = findMaximum.getMaximumValue();
        Assert.assertEquals(18.5f, maximumFloat);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtLast_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum(2.5f, 18.5f, 32.3f);
        Comparable maximumFloat = findMaximum.getMaximumValue();
        Assert.assertEquals(32.3f, maximumFloat);
    }

    @Test
    public void givenThreeStringsWithLowerCase_WhenMaximumAtFirst_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum("cat", "bat", "apple");
        Comparable maximumString = findMaximum.getMaximumValue();
        Assert.assertEquals("cat", maximumString);
    }

    @Test
    public void givenThreeStringsWithLowerCase_WhenMaximumAtMiddle_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum("bat", "cat", "apple");
        Comparable maximumString = findMaximum.getMaximumValue();
        Assert.assertEquals("cat", maximumString);
    }

    @Test
    public void givenThreeStringsWithLowerCase_WhenMaximumAtLast_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum("apple", "bat", "cat");
        Comparable maximumString = findMaximum.getMaximumValue();
        Assert.assertEquals("cat", maximumString);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtFirst_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum("CAT", "BAT", "APPLE");
        Comparable maximumString = findMaximum.getMaximumValue();
        Assert.assertEquals("CAT", maximumString);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtMiddle_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum("BAT", "CAT", "APPLE");
        Comparable maximumString = findMaximum.getMaximumValue();
        Assert.assertEquals("CAT", maximumString);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtLast_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum("APPLE", "BAT", "CAT");
        Comparable maximumString = findMaximum.getMaximumValue();
        Assert.assertEquals("CAT", maximumString);
    }

    @Test
    public void givenThreeStringsWithUpperCaseAndLowerCase_CompareString_ThenReturnMaximumString() {
        FindMaximum findMaximum = new FindMaximum("APPLE", "bat", "CAT");
        Comparable maximumString = findMaximum.getMaximumValue();
        Assert.assertEquals("bat", maximumString);
    }

    @Test
    public void givenThreeNumberAsString_whenCompare_ThenReturnMaximumString() {
        FindMaximum findMaximum = new FindMaximum("5", "8", "3");
        Comparable maximumString = findMaximum.getMaximumValue();
        Assert.assertEquals("8", maximumString);
    }

}
