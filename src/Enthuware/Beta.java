package Enthuware;

class Baap{
    public int h = 4;
    public int getH(){
        System.out.println("Baap "+h); return h;
    }
}


public class Beta extends Baap{
    public int h = 44;
    public int getH(){
        System.out.println("Beta "+h); return h;
    }
    public static void main(String[] args) {
        Baap b = new Beta();

        Beta bb = (Beta) b;
        System.out.println(b.getH()+" "+bb.getH());
    }
}
