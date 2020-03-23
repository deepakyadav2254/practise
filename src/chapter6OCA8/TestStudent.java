package chapter6OCA8;

import java.util.Objects;

class Student {
    String roll_no;
    String name;

    public Student(String roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) {
            System.out.println(getClass());
            System.out.println(o.getClass());
            return false;
        } else {
            Student s = (Student) o;
            if (this.roll_no.equals(s.roll_no) && this.name.equals(s.name))
                return true;
            else
                return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll_no, name);
    }
}

public class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student("1", "Deepak");
        Student s2 = new Student("12", "Deepak");

        System.out.println(s1.equals("deepak"));


    }
}
