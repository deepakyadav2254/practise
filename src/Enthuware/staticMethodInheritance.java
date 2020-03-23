package Enthuware;

class EnthuwareOne{
    public static  void m1()
    {
        System.out.println("helloc this is fucking parent class");
    }
}
public class staticMethodInheritance extends EnthuwareOne {

    public static void m1()
    {
        System.out.println("whats up base class");
    }

    public static void main(String[] args) {
        EnthuwareOne eone = new staticMethodInheritance();
        eone.m1();
    }
}
