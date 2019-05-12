package tehniques.a.Strings;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import ii.UnitTesting.c.CoreUnitTestingTechniques.HtmlFormatter;
import org.junit.jupiter.api.Test;

public class HtmlFormatterTests
{
    @Test
    public void formatAsBold_whenCalled_enclosesStringWithStrongElement()
    {
        HtmlFormatter formatter = new HtmlFormatter();

        String result = formatter.FormatAsBold("abc");

        //very specific --prea specific
        //assertThat(result).isEqualTo("<strong>abc</strong>");

        //specific
        assertThat(result).isEqualToIgnoringCase("<strong>abc</STRONG>");

        //more general -- prea general
        //assertThat(result).startsWith("<strong>")
                //.containsIgnoringCase("abc")
               // .endsWith("</strong>");
    }
}
