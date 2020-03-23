package Enthuware;

class Parent{

    public Parent() {
        print();
    }
     void print()
    {
        System.out.println("whats up its the print method in parent classs.");
    }
}
public class Inheritance extends Parent{

    public static void main(String[] args) {

        Parent p= new Inheritance();
        p.print();
    }
     void print()
    {
        System.out.println("this is the print method from the child class");
    }
}
