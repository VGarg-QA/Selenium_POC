import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args)
    {
        int a = 0;
        int b = 0;
        int c = 0;
        String operation = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a= ");
            a = sc.nextInt();
            System.out.println("Enter b= ");
            b = sc.nextInt();
            System.out.println("Enter operation to perform ");
            operation = sc.next();

            switch (operation) {
                case "add":
                    c = a + b;
                    System.out.println("Add=" + c);
                    break;

                case "sub":
                    c = a - b;
                    System.out.println("SUB=" + c);
                    break;

                case "multi":
                    c = a * b;
                    System.out.println("Multi=" + c);
                    break;

                case "div":
                    c = a / b;
                    System.out.println("DIV=" + c);
                    break;

                case "exit" : break;
                default:
                    System.out.println("wrong choice");
                    break;

            }
            System.out.println("Next Operation.......");
        }
        while (!operation.equalsIgnoreCase("exit"));
        // while operator value is not equal to 'exit'

    }
}
