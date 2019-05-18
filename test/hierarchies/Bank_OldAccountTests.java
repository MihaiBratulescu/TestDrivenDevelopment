package hierarchies;

import hierarchies.context.OldAccountBankContext;
import org.junit.jupiter.api.Test;
import vi.TestDrivenDevelopment.g.CleanTests.Bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bank_OldAccountTests extends OldAccountBankContext
{
    @Test
    void created_hasBalanceZero()
    {
        assertEquals(0, oldAccount.getBalance());
    }

    @Test void created_hasStandardRate()
    {
        assertEquals(getStandardBankRate(), oldAccount.getIntrestRate());
    }

    @Test void standardRateChanges_KeepsOldStandardRate()
    {
        double currentRate = getStandardBankRate();
        Bank.setStandardRate(.03);

        assertEquals(currentRate, oldAccount.getIntrestRate());
    }

    @Test void depositMoney_currentBalanceShowsMoneyInBank()
    {
        oldAccount.deposit(100);

        assertEquals(100, oldAccount.getBalance());
    }

    private double getStandardBankRate() {
        return Bank.getStandardRate();
    }
}
