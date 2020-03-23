class Animal{
    public Animal(String str) {
    }
}

class dog extends Animal{

    public dog() {
        this("hello");
    }
    public dog(String str)
    {
        super("hello super");
        System.out.println(str);

    }
}
public class ConstructorPrivacy {

    public static void main(String[] args) {
        dog d= new dog();

    }
}


