package primeFactors;

import org.junit.jupiter.api.Test;
import org.mockito.internal.util.reflection.Whitebox;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest
{
    @Test void canFactorPrimes()
    {
        assertPrimeFactorsOf(1, are());
        assertPrimeFactorsOf(2, are(2));
        assertPrimeFactorsOf(3, are(3));
        assertPrimeFactorsOf(4, are(2, 2));
        assertPrimeFactorsOf(5, are(5));
        assertPrimeFactorsOf(6, are(2, 3));
        assertPrimeFactorsOf(7, are(7));
        assertPrimeFactorsOf(8, are(2, 2, 2));
        assertPrimeFactorsOf(9, are(3, 3));
        assertPrimeFactorsOf(2*2*3*5*7*11*11, are(2, 2, 3, 5, 6, 11, 11));
    }

    private List<Integer> factorPrimes(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int divizor = 2;n > 1; divizor++)
            for (; n % divizor == 0; n /= divizor)
                factors.add(divizor);

        return factors;
    }

    private void assertPrimeFactorsOf(int i, List<Integer> are) {
        assertEquals(are, factorPrimes(i));
    }

    private List<Integer> are(Integer... primes) {
        return Arrays.asList(primes);
    }
}
