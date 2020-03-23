package chapter6OCA8;

public class Sbuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abc");

        sb.reverse().append("d");
        System.out.println(sb);
    }
}
