package ii.UnitTesting.c.CoreUnitTestingTechniques;

import java.util.EventObject;

public class ErrorLoggedEvent extends EventObject
{
    public final String loggedError;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ErrorLoggedEvent(Object source, String error)
    {
        super(source);
        loggedError = error;
    }
}
