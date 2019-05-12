package ii.UnitTesting.e.BreakingExternalDependencies.c.RefactoringTowardsLooselyCoupledDesign;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class VideoService
{
    public String readVideoTitle() throws IOException
    {
        var path   = Paths.get("videoData.txt");
        var string = Files.readAllLines(path);

        if(string == null || string.isEmpty())
        {
            return "Error parsing video.";
        }

        return new Video(string).title;
    }
}
