package ProblemStatement;

import java.io.FileNotFoundException;

public interface MyList {

    //<T> void add(T element);
    <T> T get(int index) throws FileNotFoundException;
    int length() throws FileNotFoundException;
}
