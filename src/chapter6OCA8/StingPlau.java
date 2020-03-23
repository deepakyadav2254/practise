package chapter6OCA8;

public class StingPlau
{
    public static void main(String[] args) {

        String s = "Deepak";
        String s1= "Deepak";

        String str= new String("Deepak");
        String str1= str;

        System.out.println(s==s1);
        System.out.println(str==str1);

    }
}
