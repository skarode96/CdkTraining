import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by karodes on 7/17/2017.
 */
public class PrimeTest {
    @Test
    public void testTill10() {
        List<Integer> expected = Arrays.asList(2,3,5,7);
        Assert.assertEquals("Prime Numbers till 10", expected, PrimeGenerator.generatePrime(10));
       // Assert.assertArrayEquals("Prime Numbers till 10", expected, PrimeGenerator.generatePrime(10));
    }
}
