package Inheritance_pckg;

/**
 * Created by Bonga on 2016/03/23.
 */
public class runMain
{


    public String DogFoodType()
    {
        Dog pitbull = new Dog();

        String f_type = pitbull.eat();
        return f_type;
    }

    public String BirdFoodType()
    {
        Bird pidgeon = new Bird();

        String f_type = pidgeon.eat();
        return f_type;
    }




}
