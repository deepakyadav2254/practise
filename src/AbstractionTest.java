public class AbstractionTest {
    int number1=3;
    int number2 =6;

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
        number2=number1+6;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}
