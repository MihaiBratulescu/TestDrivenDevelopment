package ii.UnitTesting.c.CoreUnitTestingTechniques;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ErrorLogger
{
    private List _listeners = new ArrayList();

    public String lastError;

    public void log(String error)
    {
        if(nullOrWhitespace(error))
            throw new IllegalArgumentException();

        lastError = error;

        //write error to log

        fireLoggedEvent(error);
    }

    public void addListener(ErrorLoggedEventListener l)
    {
        _listeners.add(l);
    }

    public void removeListener(ErrorLoggedEventListener l)
    {
        _listeners.remove(l);
    }

    private boolean nullOrWhitespace(String error) {
        return error == null || error == "";
    }

    private void fireLoggedEvent(String error)
    {
        var event = new ErrorLoggedEvent(this, error);
        Iterator listeners = _listeners.iterator();
        while( listeners.hasNext() ) {
            ( (ErrorLoggedEventListener) listeners.next() ).errorLogged(event);
        }
    }
}
