package ii.UnitTesting.c.CoreUnitTestingTechniques;

public class CustomerStore
{
    public ActionResult getCustomer(int id)
    {
        if(id == 0)
            return new NotFound();

        return new Ok();
    }
}
