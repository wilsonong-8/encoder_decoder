import org.junit.Assert;
import org.junit.Test;

public class KeyTableTest {

    @Test
    public void testConvertIntToChar() {
        KeyTable keyTable = new KeyTable();
        Assert.assertEquals('A', keyTable.convertIntToChar(0));
        Assert.assertEquals('B', keyTable.convertIntToChar(1));
        Assert.assertEquals('.', keyTable.convertIntToChar(42));
        Assert.assertEquals('/', keyTable.convertIntToChar(43));
        // Add more test cases for other index values and characters
    }

    @Test
    public void testConvertCharToInt() {
        KeyTable keyTable = new KeyTable();
        Assert.assertEquals(0, keyTable.convertCharToInt('A'));
        Assert.assertEquals(1, keyTable.convertCharToInt('B'));
        Assert.assertEquals(33, keyTable.convertCharToInt('7'));
        Assert.assertEquals(39, keyTable.convertCharToInt('+'));
        // Add more test cases for other characters and index values
    }
}