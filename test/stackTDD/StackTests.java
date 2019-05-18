package stackTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTests
{
    @Test void push_popBack()
    {
        Stack<Integer> stack = new Stack();

        stack.push(2);

        assert 2 == stack.pop();
    }

    @Test void pushTwo_popBackInRevereOrder()
    {
        Stack<Integer> stack = new Stack();

        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop()) ;
        assertEquals(2, stack.pop()) ;
    }
}
