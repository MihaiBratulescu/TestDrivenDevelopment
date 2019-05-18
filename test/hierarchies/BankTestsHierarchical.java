package hierarchies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vi.TestDrivenDevelopment.g.CleanTests.Account;
import vi.TestDrivenDevelopment.g.CleanTests.Bank;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTestsHierarchical
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
            Bank.setStandardRate(.03);
        }
    }

    public static class NewAccountContext extends BankContext
    {
        Account newAccount;

        @BeforeEach void setupNewAccount()
        {
            newAccount = new Account();
            System.out.println("NewAccountContext setup");
        }

        @Test void given_when_then() {}
    }

    public static class OldAccountContext extends BankContext
    {
        Account oldAccount;

        @BeforeEach void setupOldAccount()
        {
            oldAccount = new Account();
            Bank.setStandardRate(.026);
            System.out.println("old account setup");
        }

        //@Test void given_when_then() {}
    }

    public static class AfterIntrestRateChangesContext extends OldAccountContext
    {
        @BeforeEach void setupChangeIntrestRate()
        {
            System.out.println("ChangeIntrestRate setup");
        }

        @Test void when_then2() {}
    }
}
