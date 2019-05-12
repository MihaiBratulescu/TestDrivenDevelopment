package math;

import ii.UnitTesting.b.UnitTestingFundamentals.d.WritingSomeSimpleUnitTests.Math;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MathTests
{
    private Math _math;

    @BeforeEach
    void setUp()
    {
        //arrange
        _math = new Math();
    }

    @Test
    public void add_whenCalled_ReturnsSumOfArguments()
    {
        //act
        var result = _math.add(1, 2);

        //assert
        assertEquals(3, result);
    }

    @ParameterizedTest
    @MethodSource("maxParameters")
    public void max_whenCalled_returnsTheGreaterArgument(int a, int b, int expectedResult)
    {
        var result = _math.max(a, b);

        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> maxParameters()
    {
        return Stream.of(
                Arguments.of(1, 2, 2),
                Arguments.of(2, 1, 2),
                Arguments.of(2, 2, 2));
    }
}
