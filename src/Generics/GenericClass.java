package Generics;

class Test<T>
{
    T obj;

    public Test(T obj) {
        this.obj = obj;
    }

    public T getObj()
    {
        return  this.obj;
    }
}
public class GenericClass {

    public static void main(String[] args) {
        Test<Integer> one= new Test<Integer>(15);
        Test<String> string = new Test<String>("Bad Horse");
        System.out.println(one.obj);
        System.out.println(string.getObj());
    }
}
