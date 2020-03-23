import javax.management.MBeanAttributeInfo;

enum CoffeeSize1{

    BIG(6),MEDIUM(4),SMALL(2)
            {
                public String getCode()
                {
                    return "a";
                }
            };

    CoffeeSize1(int ounces)
    {
        this.ounces=ounces;
    }
    private int ounces;

    public int getOunces()
    {
        return ounces;
    }
    public String getCode()
    {
        return "B";
    }
}
public class Coffee1 {

    CoffeeSize size;
    public static void main(String[] args) {

        for(CoffeeSize1 cs:CoffeeSize1.values())
            System.out.println("ounces "+cs.getOunces()+"code is"+cs.getCode());
    }
}
