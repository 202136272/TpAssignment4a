package Encapsulation_pckg;

/**
 * Created by Bonga on 2016/03/23.
 */
public class runPerson
{
    public String FnameDetails() {
        Person myPerson = new Person();
        myPerson.setFirstName("Boniface");

        String fname = myPerson.getFirstName();
        return fname;
    }

    public String LnameDetails()
    {
        Person myPerson = new Person();
        myPerson.setLastName("Kabaso");

        String Lname = myPerson.getLastName();
        return Lname;
    }



}
