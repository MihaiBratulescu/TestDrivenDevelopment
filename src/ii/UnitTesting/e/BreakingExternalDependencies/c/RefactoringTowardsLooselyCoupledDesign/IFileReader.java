package ii.UnitTesting.e.BreakingExternalDependencies.c.RefactoringTowardsLooselyCoupledDesign;

import java.io.IOException;
import java.util.List;

public interface IFileReader
{
    List<String> readFile(String path) throws IOException;
}
