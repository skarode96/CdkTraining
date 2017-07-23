import com.sun.org.apache.xpath.internal.operations.Bool;
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
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        Assert.assertEquals("Prime Numbers till 10", expected, PrimeGenerator.generatePrime(10));
        System.out.println(PrimeGenerator.generatePrime(12));
        // Assert.assertArrayEquals("Prime Numbers till 10", expected, PrimeGenerator.generatePrime(10));
    }

    @Test
    public void testTilll2() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11);
        Assert.assertEquals("Prime Numbers till 12", expected, PrimeGeneratorOptimize.generatePrime(12));
    }
}
