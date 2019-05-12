package exercises;

import ii.UnitTesting.d.Exercises.DemeritPointsCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemeritPointsCalculatorTests
{
    DemeritPointsCalculator calculator;

    @BeforeEach
    void setUp()
    {
        calculator = new DemeritPointsCalculator();
    }

    @Test
    public void CalculateDemeritPoints_speedLessThanZero_ThrowsIllegalArgumentException()
    {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.CalculateDemeritPoints(-1));
    }

    @Test
    public void calculateDemeritPoints_speedLessThanSpeedLimit_returnsZero()
    {
        int result = calculator.CalculateDemeritPoints(50);

        assertEquals(0, result);
    }

    @ParameterizedTest
    @MethodSource("penaltyData")
    public void calculateDemeritPoints_aboveSpeedLimit_returnsDemeritPoints(
            int speed, int expectedPoints)
    {
        int result = calculator.CalculateDemeritPoints(speed);

        assertEquals(expectedPoints, result);
    }

    private static Stream<Arguments> penaltyData()
    {
        return Stream.of(Arguments.of(55, 1),
                Arguments.of(60, 2),
                Arguments.of(65, 3));
    }
}
