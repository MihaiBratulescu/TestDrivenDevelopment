package fixtures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TransientFresh
{
    public TransientFresh()
    {
        System.out.println("constructor");
    }

    @BeforeEach void setup()
    {
        System.out.println("setup");
    }

    @Test void test1()
    {
        System.out.println("test1");
    }

    @Test void test2()
    {
        System.out.println("test2");
    }
}
