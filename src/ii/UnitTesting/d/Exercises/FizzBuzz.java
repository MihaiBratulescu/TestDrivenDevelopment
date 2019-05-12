package ii.UnitTesting.d.Exercises;

public class FizzBuzz
{
    public String Get(Integer number)
    {
        if((number % 3 == 0) && (number % 5 == 0))
            return "FizzBuzz";

        if(number % 3 == 0)
            return  "Fizz";

        if(number % 5 == 0)
            return "Buzz";

        return number.toString();
    }
}
