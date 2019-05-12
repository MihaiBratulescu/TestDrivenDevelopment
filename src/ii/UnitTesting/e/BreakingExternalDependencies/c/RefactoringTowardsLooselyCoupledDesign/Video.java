package ii.UnitTesting.e.BreakingExternalDependencies.c.RefactoringTowardsLooselyCoupledDesign;

import java.util.List;

public class Video
{
    public String title;

    public Video(List<String> string) {
        if(string != null && !string.isEmpty())
        {
            title = string.get(0);
        }
    }
}
