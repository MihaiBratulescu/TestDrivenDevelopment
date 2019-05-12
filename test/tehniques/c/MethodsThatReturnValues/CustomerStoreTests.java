package tehniques.c.MethodsThatReturnValues;

import ii.UnitTesting.c.CoreUnitTestingTechniques.*;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerStoreTests
{
    private CustomerStore _store;

    @BeforeEach
    public void setUp()
    {
        _store = new CustomerStore();
    }

    @Test
    public void getCustomer_idIsZero_returnsNotFound()
    {
        var result = _store.getCustomer(0);

        //general (ActionResult or any of it's derivatives)
        //--too general
        //assertThat(result).isInstanceOf(ActionResult.class);

        //specific (Exactly of type NotFound)
        assertThat(result).isExactlyInstanceOf(NotFound.class);
    }

    @Test
    public void getCustomer_idIsNotZero_returnsOk()
    {
        var result = _store.getCustomer(1);

        assertThat(result).isExactlyInstanceOf(Ok.class);
    }
}
