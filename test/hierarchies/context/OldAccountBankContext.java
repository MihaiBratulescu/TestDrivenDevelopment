package hierarchies.context;

import vi.TestDrivenDevelopment.g.CleanTests.Account;
import vi.TestDrivenDevelopment.g.CleanTests.Bank;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OldAccountBankContext
{
    protected Account oldAccount;

    @BeforeEach
    void setup()
    {
        Bank.setStandardRate(.03);
        oldAccount = new Account();
    }


}
