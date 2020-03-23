class A{

    public A() { }
    public A(int i) {   System.out.println(i );    }
}
public class B{
    A a = new A(15);
    A a1 = new A(2);
    public static void main(String[] args){
        B b = new B();
        A a = new A(3);
    }

}