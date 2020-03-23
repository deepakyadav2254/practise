package chapter6OCA8;

public class arrayPlay {

    public static int NUMBER=15;
    public static void main(String[] args) {
        int[] mybytes= new int[]{2,3,4};
        int[] byteToInt;
        byteToInt=mybytes;

        byte b=5;
        char c='f';
        short s=45;
        int[] arr= new int[]{b,c,s};

        int[] array1= new int[5];

        for(int arr3:array1)
        {
            System.out.println(arr3);
        }
    }
}
