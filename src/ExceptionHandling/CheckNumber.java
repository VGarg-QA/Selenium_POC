package ExceptionHandling;

public class CheckNumber {

    void checkNumber(int number) {
        if (number >= 1 && number <= 10)
            System.out.println("We are safe");
        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) {

    int a=15;
        System.out.println("Start of the program");
        System.out.println("a =" + a);
        System.out.println("Checking the value");
        CheckNumber ob =new CheckNumber();
        ob.checkNumber(a);

        System.out.println("Done with the program");
        System.out.println("End  of the program");


    }
}
