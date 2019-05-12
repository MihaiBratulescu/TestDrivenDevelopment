package tehniques.f.Events;

import ii.UnitTesting.c.CoreUnitTestingTechniques.ErrorLogger;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ErrorLogger_ErrorLoggedEventTests
{
    @Test
    public void log_whenCalled_raisesEvent()
    {
        var logger = new ErrorLogger();

        //subscribe to event
        var listener = new ErrorLoggedTestListener();
        logger.addListener(listener);

        //act
        logger.log("test string");

        //check event was raised
        assertThat(listener.recievedEvent.loggedError)
                .isEqualTo("test string");
    }
}
