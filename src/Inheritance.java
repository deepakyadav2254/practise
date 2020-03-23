class Dog {

    public void bark()
    {
        System.out.println("all dogs bark");
    }
}

class jindo extends Dog {
    public void bark(){
        System.out.println("jindo never barks it is a great dog");
    }
    public void origin() {
        System.out.println("jindo is a korean breed");
    }
}

class sharPie extends Dog {
    public void origin()
    {
        System.out.println("Sharpie is a chinese dog");
    }
}


public class Inheritance {
    public static void getDog(Dog dog)
    {
        dog.bark();
        sharPie s = null;
    }

    public static void main(String[] args) {
        jindo j = new jindo();
        sharPie s= new sharPie();
        System.out.println(j instanceof jindo);
        System.out.println(j instanceof Dog);
        Dog d= new sharPie();
        d.bark();
        sharPie s1=(sharPie)d;
        s1.origin();

        getDog(j);
        getDog(s);

        Dog[] array = new Dog[]{j,s};

        for (Dog dog : array) {
            dog.bark();
        }
    }
}

