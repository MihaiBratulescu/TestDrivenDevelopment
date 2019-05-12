package exercises;

import ii.UnitTesting.d.Exercises.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTests
{
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp()
    {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @MethodSource("fizzBuzzData")
    public void get_whenCalled_returnsExpectedString(int number, String expected)
    {
        //act
        var result = fizzBuzz.Get(number);

        //assert
        assertEquals(expected, result);
    }

    private static Stream<Arguments> fizzBuzzData()
    {
        return Stream.of(
                Arguments.of(15, "FizzBuzz"),
                Arguments.of(5, "Buzz"),
                Arguments.of(3, "Fizz"),
                Arguments.of(1, "1")
        );
    }
}
