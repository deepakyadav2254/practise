package chapter6OCA8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class dateAndTime {

    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMddyyyy");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter");
        String input= sc.nextLine();
        LocalDate bday=null;
        try{
            bday=LocalDate.parse(input,f);
        }
        catch (java.time.DateTimeException e)
        {

        }
        System.out.println("your birthday is "+bday);
        System.out.println("a"+bday.getDayOfWeek());

        Period p= Period.between(bday,LocalDate.now());
        System.out.println(p.getYears());
    }
}
