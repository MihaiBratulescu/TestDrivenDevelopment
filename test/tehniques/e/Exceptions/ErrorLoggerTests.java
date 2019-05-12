package tehniques.e.Exceptions;

import ii.UnitTesting.c.CoreUnitTestingTechniques.ErrorLogger;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ErrorLoggerTests
{
    @Test
    public void log_invalidMessage_throwsIllegalArgumentException()
    {
        ErrorLogger logger = new ErrorLogger();

        assertThrows(IllegalArgumentException.class,
                () -> logger.log(null));
    }
}
