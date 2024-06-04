package CollectionDemo.StackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("Raj");
        s.push("Anita");
        s.push("Priya");
        s.push("Amit");
        s.push("Sneha");
        s.push("Rohan");
        s.push("Neha");

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

    }
}
