package tehniques.d.VoidMethods;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import ii.UnitTesting.c.CoreUnitTestingTechniques.ErrorLogger;
import org.junit.jupiter.api.*;

import java.util.logging.Logger;

public class ErrorLoggerTests
{
    /*
    * So far we tested methods that return some value
    * What are void methods? Commands!
    * What do commands do?
    */

    @Test
    public void log_whenCalled_lastErrorProperyWasSet()
    {
        ErrorLogger logger = new ErrorLogger();

        logger.log("test string");

        //assert system state after command
        assertThat(logger.lastError).isEqualTo("test string");
    }
}
