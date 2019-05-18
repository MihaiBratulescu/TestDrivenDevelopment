package hierarchies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTests
{
    private static final double MONEY_DELTA = .00001;

    private static void assertMoneyEquals(double expected, double actual)
    {
        assertEquals(expected, actual, MONEY_DELTA);
    }

    public static class BankContext
    {
        @BeforeEach void setup()
        {
            System.out.println("BankContext setup");
        }
    }

    public static class NewAccountContext extends BankContext
    {
        @BeforeEach void setupNewAccount()
        {
            System.out.println("NewAccountContext setup");
        }

        @Test void given_when_then() {}
    }

    public static class OldAccountContext extends BankContext
    {
        @BeforeEach void setupOldAccount()
        {
            System.out.println("OldAccountContext setup");
        }

        @Test void given_when_then() {}
    }

    public static class AfterIntrestRateChangesContext extends OldAccountContext
    {
        @BeforeEach void setupChangeIntrestRate()
        {
            System.out.println("ChangeIntrestRate setup");
        }

        @Test void given_when_then2() {}
    }
}
