package Casting;

class Animal {
    void eat() {
        System.out.println("All animals eat");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dogs like meat to eat");
    }

    void bark() {
        System.out.println("Dog makes barking noise");
    }
}

public class CastingCases {
    public static void main(String[] args) {
     /*   Animal a = new Dog();
        if(a instanceof Dog ) {
            Dog d = (Dog) a;  //    THIS CODE WORKS ABSOLUTLY FINE.
            d.bark();
        }*/
    Animal a =new Animal();
    //Dog d=(Dog)a;   Both of the class comes under the same inheritance tree, so the compiler is not sure whether
        // amimal IS-A dog thats why it compiles fine but error is thrown at runtime.

    //String s =(String)a ;   Fails because the compiler knows Animal cant ever be a String.

    }
}
