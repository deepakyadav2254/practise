package chapter6OCA8;

public class twoDimentionalArray {

    public static void main(String[] args) {
        int[][] myInt= new int[2][];

        myInt[0]= new int[2];
        myInt[0][0]=1;
        myInt[0][1]=2;

        myInt[1]= new int[]{2,3,6,7};


       for (int i = 0; i <myInt.length ; i++) {
            for (int j = 0; j <myInt[i].length ; j++) {
                System.out.println(myInt[i][j]);
            }
            System.out.println();
        }
        for (int[] ints : myInt) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
