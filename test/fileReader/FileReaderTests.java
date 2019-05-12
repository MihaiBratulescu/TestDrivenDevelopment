package fileReader;

import ii.UnitTesting.e.BreakingExternalDependencies.c.RefactoringTowardsLooselyCoupledDesign.IFileReader;
import ii.UnitTesting.e.BreakingExternalDependencies.c.RefactoringTowardsLooselyCoupledDesign.VideoService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

public class FileReaderTests
{
    @Test
    public void readVideoTitle_invalidFile_returnsError() throws IOException {
        IFileReader reader = mock(IFileReader.class);
        VideoService service = new VideoService();

        var result = service.readVideoTitle(reader);

        assertThat(result).containsIgnoringCase("error");
    }

    @Test
    public void readVideTitle_validFile_returnsFileTitle() throws IOException {
        IFileReader reader = mock(IFileReader.class);
        VideoService service = new VideoService();

        var data = new ArrayList<String>();
        data.add("video title");

        when(reader.readFile(anyString()))
                .thenReturn(data);

        var result = service.readVideoTitle(reader);

        assertEquals(result, "video title");
        verify(reader, times(1)).readFile(anyString());
    }

}
