package fixtures;

import org.junit.jupiter.api.*;

public class PersistentShared
{
    @BeforeAll static void suiteSetup()
    {
        System.out.println("suiteSetup");
    }

    @BeforeEach
    void setup()
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

    @AfterEach
    void teardown()
    {
        System.out.println("teardown");
    }

    @AfterAll static void suiteTeardown()
    {
        System.out.println("suiteTeardown");
    }
}
