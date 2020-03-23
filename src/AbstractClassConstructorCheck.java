

abstract class abstractClass{
    public abstractClass() {
        System.out.println("hello hello");
    }

    public abstract void m1();
}

public class AbstractClassConstructorCheck extends abstractClass {

    public void m1()
    {

    }
    public static void main(String[] args) {
        AbstractClassConstructorCheck ab = new AbstractClassConstructorCheck();

    }
}
