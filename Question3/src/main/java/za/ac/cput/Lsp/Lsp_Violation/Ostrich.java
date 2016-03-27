package za.ac.cput.Lsp.Lsp_Violation;

/**
 * Created by Scorpian on 2016-03-27.
 */
public class Ostrich extends Bird {


    public String eat()
    {
        return "i am an ostrich that can eat";
    }


    public String fly()
    {
        throw new UnsupportedOperationException();
    }
}
