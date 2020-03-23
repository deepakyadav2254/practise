package Enthuware;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;

class Parent1{
    public void myMethod() throws IOException
    {
        System.out.println("parent class method");
    }
}
public class ExceptionCheck extends Parent1 {
    public void myMethod() throws SocketException
    {
        System.out.println("child class method");
    }

    public static void main(String[] args) throws IOException {
        Parent1 p= new ExceptionCheck();

        p.myMethod();
    }
}
