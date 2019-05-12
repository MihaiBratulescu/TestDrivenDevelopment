package fileReader;

import ii.UnitTesting.e.BreakingExternalDependencies.c.RefactoringTowardsLooselyCoupledDesign.IFileReader;

import java.io.IOException;
import java.util.List;

public class FakeEmptyDataFileReader implements IFileReader
{
    @Override
    public List<String> readFile(String path) throws IOException {
        return null;
    }
}
