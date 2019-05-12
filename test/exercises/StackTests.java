package exercises;

import ii.UnitTesting.d.Exercises.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTests
{
    public Stack<Object> stack;

    @BeforeEach
    void setUp()
    {
        stack = new Stack<>();
    }

    @Test
    public void getCount_emptyStack_returnsZero(){
        var result = stack.getCount();

        assertEquals(0, result);
    }

    @Test
    public void getCount_afterPushing_returnsOne(){
        stack.push(1);

        var result = stack.getCount();

        assertEquals(1, result);
    }

    @Test
    public void push_popExisting_returnsLastAddedValueAndStackIsEmpty() throws OperationNotSupportedException {
        stack.push(1);

        var result = stack.pop();

        assertEquals(1, result);
        assertEquals(0, stack.getCount());
    }

    @Test
    public void pop_emptyStack_throwsOperationNotSupportedException()
    {
        assertThrows(OperationNotSupportedException.class,
                () -> stack.pop());
    }
}
