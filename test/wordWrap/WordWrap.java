package wordWrap;

public class WordWrap {
    protected String wrap(String s, int width)
    {
        if(s == null)
            return "";

        if(s.length() <= width)
            return  s;

        int breakpoint = s.lastIndexOf(" ", width);
        if(breakpoint == -1)
        {
            breakpoint = width;
        }

        return s.substring(0, breakpoint) + "\n" +
                wrap(s.substring(breakpoint).trim(), width);
    }
}
