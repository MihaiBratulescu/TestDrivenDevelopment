package bowling;

import jdk.jfr.Unsigned;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vi.TestDrivenDevelopment.d.Examples.bowling.BowlingScore;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTests
{
    BowlingScore game;
    @BeforeEach void setup()
    {
        game = new BowlingScore();
    }

    @Test void gutterGame()
    {
        rollMany(20, 0);

        int result = game.score();

        assertEquals(0, result);
    }

    @Test void allOne()
    {
        rollMany(20, 1);

        assertEquals(20, game.score());
    }

    @Test void oneSpare()
    {
        rollSpare();
        game.roll(3);
        rollMany(17, 0);

        assertEquals(16, game.score());
    }

    @Test void oneStrike()
    {
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16, 0);

        assertEquals(24, game.score());
    }

    @Test void perfectGame()
    {
        rollMany(12, 10);

        assertEquals(300, game.score());
    }

    private void rollStrike() {
        game.roll(10);
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollMany(int count, int pins) {
        for (int i = 0; i < count; i++)
            game.roll(pins);
    }
}
