package hierarchies;

import hierarchies.context.OldAccountBankContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vi.TestDrivenDevelopment.g.CleanTests.Account;
import vi.TestDrivenDevelopment.g.CleanTests.Bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BankTests extends OldAccountBankContext
{
    private Account newAccount;

    @BeforeEach void setup()
    {
        Bank.setStandardRate(.035);
        newAccount = new Account();
    }


    @Test void standardRateChanges_newAccountUseNewStandardRate()
    {
        assertEquals(Bank.getStandardRate(), newAccount.getIntrestRate());
    }

    @Test void newAccountWith100_returnsCorrectIntrest()
    {
        newAccount.deposit(100);

        assertEquals(Bank.getStandardRate() * 100, newAccount.getIntrest());
    }
}
