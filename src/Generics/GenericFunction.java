package Generics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class GenericFunction {

    public static <T> T get(int index) throws FileNotFoundException {
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

        static <T> void add()
        {
            try {
                Files.write(Paths.get("C:\\Users\\Deepak Yadav\\IdeaProjects\\practise\\src\\ProblemStatement\\list-numbers.txt"),
                        "the text".getBytes(), StandardOpenOption.APPEND);
                System.out.println("copied");
            }catch (IOException e) {
                //exception handling left as an exercise for the reader
            }
        }


    public static void main(String[] args) throws FileNotFoundException {

       String str= get(4);
       add();
        System.out.println(str);
    }
}

