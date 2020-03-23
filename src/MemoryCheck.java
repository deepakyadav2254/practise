import java.util.Date;

public class MemoryCheck {
    public static void main(String[] args) {
        Runtime rt= Runtime.getRuntime();
        System.out.println("Total memory"+rt.totalMemory());
        System.out.println("free memory"+rt.freeMemory());
        Date d=null;
        for (int i=0;i<10000000;i++)
        {
            d=new Date();
            d=null;
        }
        System.out.println("After creating the objects free memory"+rt.freeMemory());
        rt.gc();
        System.out.println("After running the GC free memory"+rt.freeMemory());

    }
}
