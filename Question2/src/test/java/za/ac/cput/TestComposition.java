package za.ac.cput;

import junit.framework.Assert;
import za.ac.cput.Composition_pckg.Person;

/**
 * Created by Bonga on 2016/03/24.
 */
public class TestComposition
{

    private Person lawyer;

    @org.junit.Test
    public void testSalary() throws Exception {
        lawyer = new Person();
        Assert.assertEquals(1000,lawyer.getSalary());

    }


}
