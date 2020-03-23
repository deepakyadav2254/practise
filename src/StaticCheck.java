import java.time.temporal.ChronoUnit;

class Father {
    static void m1() {
        System.out.println("parent claSSSss m1");
    }
}

class Child extends Father {

    static void m1() {
        System.out.println("overridden method");
    }
}

public class StaticCheck {
    public static void main(String[] args) {
        Father f= new Child();
        f.m1();
    }
}
