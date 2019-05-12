package ii.UnitTesting.d.Exercises;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class Stack<T>
{
    private final List<T> list = new ArrayList<>();

    public void push(T obj)
    {
        if(obj == null)
            throw new NullPointerException();

        list.add(obj);
    }

    public T pop() throws OperationNotSupportedException
    {
        if(list.size() == 0)
            throw new OperationNotSupportedException();

        var result = list.get(list.size() - 1);
        list.remove(result);

        return result;
    }

    public T peek()throws OperationNotSupportedException
    {
        if(list.size() == 0)
            throw new OperationNotSupportedException();

        return list.get(list.size() - 1);
    }

    public int getCount()
    {
        return  list.size();
    }
}
