package ProblemStatement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MyListImpl implements MyList {


    public  <T> T get(int index) throws FileNotFoundException {
        T t= null;
        int counter=0;
        File file = new File("C:\\Users\\Deepak Yadav\\IdeaProjects\\practise\\src\\ProblemStatement\\list-strings.txt");
        Scanner sc= new Scanner(file);
        sc.useDelimiter(",");


        while(sc.hasNext())
        {
            if(counter==index)
            {
                System.out.println("Match found ");
                System.out.println("index is "+index+"counter is "+counter);
                t= (T) sc.next();
                break;
            }
            counter++;
            sc.next();
               /* System.out.println(counter+" "+sc.next());
               counter++;*/
        }
        return t;
    }

    public int length() throws FileNotFoundException {
        int counter=0;
        File file = new File("C:\\Users\\Deepak Yadav\\IdeaProjects\\practise\\src\\ProblemStatement\\list-strings.txt");
        Scanner sc= new Scanner(file);
        sc.useDelimiter(",");

//        while(sc.hasNext())
//        {
//            counter+=counter;
//        }
        return counter;
    }


    public static void main(String[] args) throws FileNotFoundException {

       String index= new MyListImpl().get(44);
        System.out.println(index);

        int length=new MyListImpl().length();
        System.out.println("The length is"+length);
    }
}
