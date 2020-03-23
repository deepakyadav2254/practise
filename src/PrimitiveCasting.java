public class PrimitiveCasting {
    public static void main(String[] args) {
        byte b1=4;
        int i1=123456;
        long L1=(long)i1;
        short s2=(short)i1;
        byte b2=(byte)i1;
        int i2= (int)1234.456;

        System.out.println(s2);
        System.out.println(b2);
        System.out.println(i2);

        int b3= b1+7;
        System.out.println(b3);
    }
}
