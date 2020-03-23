
enum CoffeeSize{

    BIG(6),MEDIUM(4),SMALL(2);

    CoffeeSize(int ounces)
    {
        this.ounces=ounces;
    }
    private int ounces;

    public int getOunces()
    {
        return ounces;
    }
}
public class Coffee {
    CoffeeSize size ;
    public static void main(String[] args) {
        System.out.println("lol");
        Coffee c1= new Coffee();
        c1.size=CoffeeSize.BIG;
        System.out.println(c1.size.getOunces());

        for(CoffeeSize cs:CoffeeSize.values())
            System.out.println(cs.getOunces());
    }
}
