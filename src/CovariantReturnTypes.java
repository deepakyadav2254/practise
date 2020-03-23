
class Alpha{
    Alpha m1()
    {
        System.out.println("parent class method");
        return new Alpha();
    }
}

class Beta extends Alpha{
    public Beta m1()
    {
        System.out.println("child class method");
        return new Beta();
    }
    public byte num()
    {
        float f=125.0f;
        return (byte) f;
    }
}


public class CovariantReturnTypes {

    public static void main(String[] args) {
        Alpha a=new Beta();
        a.m1();
        System.out.println(((Beta)a).num());
    }
}
