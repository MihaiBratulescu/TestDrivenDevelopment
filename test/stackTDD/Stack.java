package stackTDD;

import java.util.ArrayList;
import java.util.List;

public class Stack<T>
{
    private ArrayList<T> items = new ArrayList<>();

    public void push(T item)
    {
        items.add(item) ;
    }

    public T pop()
    {
        T item = items.get(items.size() - 1);

        items.remove(item);

        return item;
    }
}
