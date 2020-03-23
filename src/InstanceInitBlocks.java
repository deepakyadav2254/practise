class Aninmal1
{
    public Aninmal1(String str) {
        System.out.println("Parent class constructor");
    }
    {
        System.out.println("super class instance block");
    }
    static {
        System.out.println("static block parent class");
    }
}

class Bull extends Aninmal1
{
    public Bull() {
        this("ste");
        System.out.println("no args constructor");
    }
    public Bull(String str)
    {
        super("deepa");
        System.out.println("child class args constructor");
    }

    static {
        System.out.println("static block one");
    }
    {
        System.out.println("instance block one");
    }
    {
        System.out.println("instance block two");
    }
}

public class InstanceInitBlocks {

    public static void main(String[] args) {
        Bull b= new Bull();
    }
}
