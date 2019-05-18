package wordWrap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordWrapTests {
    WordWrap wrapper = new WordWrap();

    @Test void shouldWrap()
    {
        assertWarp(null, 1, "");
        assertWarp("", 1, "");
        assertWarp("x", 1, "x");
        assertWarp("xx", 1, "x\nx");
        assertWarp("xxx", 1, "x\nx\nx");
        assertWarp("x x", 1, "x\nx");
        assertWarp("x xx", 3, "x\nxx");
        assertWarp("four score and seven years ago our fathers " +
                "brought forth upon this continent", 7, "four\nscore\nand\nseven\nyears\nago " +
                "our\nfathers\nbrought\nforth\nupon\nthis\ncontine\nnt");
    }

    private void assertWarp(String input, int width, String expected) {
        assertEquals(expected, wrapper.wrap(input, width));
    }
}
