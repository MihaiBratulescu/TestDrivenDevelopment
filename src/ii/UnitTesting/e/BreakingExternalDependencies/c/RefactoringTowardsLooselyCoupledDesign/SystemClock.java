package ii.UnitTesting.e.BreakingExternalDependencies.c.RefactoringTowardsLooselyCoupledDesign;

import java.util.Date;

public class SystemClock
{
    private Date _currentDate;

    public Date GetCurrentTime()
    {
        if(_currentDate != null)
            return new Date();
        else
            return _currentDate;
    }

    public void setDate(Date d)
    {
        _currentDate = d;
    }
}
