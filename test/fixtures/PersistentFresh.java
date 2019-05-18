package fixtures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

public class PersistentFresh
{
    public PersistentFresh()
    {
        System.out.println("constructor");
    }

    @BeforeEach void setup()
    {
        System.out.println("setup");
    }

    @Test
    void test1()
    {
        System.out.println("test1");
    }

    @Test void test2()
    {
        System.out.println("test2");
    }

    @AfterEach void teardown()
    {
        System.out.println("teardown");
    }
}
