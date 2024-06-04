import java.util.Scanner;
import static org.apache.commons.lang3.RandomUtils.nextFloat;

public class Triangle {
    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle ");

        double side1 = sc.nextFloat();
        double side2 = sc.nextFloat();
        double side3 = sc.nextFloat();

        if ((side1 + side2 + side3 == 180) && side1>0 && side2>0 && side3>0)
        {
            if (side1 == side2 && side2 == side3 && side3 == side1)
                System.out.println(" Equilateral Triangle ");

            if ((side1 == side2 && side2 != side3) || (side1 == side3 && side3 != side2) || (side2 == side3 && side3 != side1))
                System.out.println(" Isosceles Triangle ");

            if (side1 != side2 && side2 != side3 && side3 != side1)
                System.out.println(" Scalene Triangle ");

            if (side1 == 90 || side2 == 90 || side3 == 90)
                System.out.println("Right Angled Triangle");
            }
            else
                System.out.println("Not a triangle");
        }
    }