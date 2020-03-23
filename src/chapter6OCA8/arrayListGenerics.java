package chapter6OCA8;

import java.util.ArrayList;

public class arrayListGenerics {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("lol");
        al.add("deepak");
        al.add(new Integer(56));
        System.out.println(al);

        for (Object all : al) {
            int a=(Integer)all;
        }
    }
}
