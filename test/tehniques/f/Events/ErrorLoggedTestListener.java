package tehniques.f.Events;

import ii.UnitTesting.c.CoreUnitTestingTechniques.ErrorLoggedEvent;
import ii.UnitTesting.c.CoreUnitTestingTechniques.ErrorLoggedEventListener;

public class ErrorLoggedTestListener implements ErrorLoggedEventListener
{
    public ErrorLoggedEvent recievedEvent;

    @Override
    public void errorLogged(ErrorLoggedEvent event)
    {
        recievedEvent = event;
    }
}
