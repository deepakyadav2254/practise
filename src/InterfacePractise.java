import javax.swing.*;

interface one1{
    default void m1()
    {
        System.out.println("interface one");
    }
}

interface two2{
    default void m1()
    {
        System.out.println("interface one");
    }
}

public class InterfacePractise implements one1,two2{

    public  void m1()
    {
       one1.super.m1();
    }
    public static void main(String[] args) {

        InterfacePractise ip= new InterfacePractise();
        ip.m1();
    }
}
