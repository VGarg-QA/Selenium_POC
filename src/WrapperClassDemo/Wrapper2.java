package WrapperClassDemo;

public class Wrapper2 {
    public static void main(String[] args) {

        Integer ii = new Integer(5);
        int i = ii.intValue(); // unboxing/unwrapping

        System.out.println("ii =" + ii);
        System.out.println("i =" + i); // Auto unboxing or Auto wrapping
    }
}
