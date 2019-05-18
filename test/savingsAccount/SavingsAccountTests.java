package savingsAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTests
{
    SavingsAccountBase savingsAccount;
    SavingsAccountBase marketSavingsAccount;
    @BeforeEach void setup()
    {
        savingsAccount = new PrivateSavingsAccount();
        marketSavingsAccount = new MarketSavingsAccount();
    }

    @Test void accountWith100HasIntrest3()
    {
        savingsAccount.deposit(100);

        assertEquals(3, savingsAccount.getIntrest());
    }

    @Test void markeetAccountWith100HasIntrest5()
    {
        marketSavingsAccount.deposit(100);

        assertEquals(5, marketSavingsAccount.getIntrest());
    }
}
