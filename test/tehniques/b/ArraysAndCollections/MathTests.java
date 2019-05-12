package tehniques.b.ArraysAndCollections;

import org.junit.jupiter.api.Test;
import ii.UnitTesting.b.UnitTestingFundamentals.d.WritingSomeSimpleUnitTests.Math;

import static org.assertj.core.api.Assertions.assertThat;

public class MathTests
{
    @Test
    public void getOddNumbers_whenCalled_returnsOddNumbersUpToLimit()
    {
        Math math = new Math();

        var result = math.getOddNumbers(5);

        //general --prea general
        //assertThat(result).isNotEmpty();

        //more specific
        assertThat(result).contains(1)
                .contains(3)
                .contains(5);//etc

        //cleaner way
        assertThat(result).contains(1, 5, 3, 7, 9);

        //very specific --prea specific
        //assertThat(result).containsExactly(1, 3, 5, 7, 9);

        //extra assertions
        assertThat(result).isSorted();
        assertThat(result).doesNotHaveDuplicates();
    }
}
