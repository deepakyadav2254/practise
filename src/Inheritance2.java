
class Horse
{
     void eat()
    {
        System.out.println("parent class eat");
    }
}
public class Inheritance2 extends Horse{
//    public void eat()
//    {
//        System.out.println("whats up");
//    }
    public static void main(String[] args) {

        Inheritance2 i2= new Inheritance2();
        i2.eat();
    }
}
