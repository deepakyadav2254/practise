
interface one
{

    default void m2()
    {
        System.out.println("default method interface 1");
    }
}

interface two
{

    default void m2()
    {
        System.out.println("default method interface 2");
    }
}

public class PractiseAbstractInterface implements one,two  {
    public void m2()
    {
        two.super.m2();

    }

    public static void main(String[] args) {

        PractiseAbstractInterface p= new PractiseAbstractInterface();
        p.m2();
    }
}
