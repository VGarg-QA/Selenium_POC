package Methods;

public class MethodsWithArguments {

    void noArgument()
    {
        System.out.println("No Argument");
    }

    void areaCircle(double r) //singleArgument(int r)
    {
        System.out.println("r=" + r);
        double area = 3.14 * r* r ;
        System.out.println("area =" + area);
    }

    void areaRectangle(int l, int b)
    {
        System.out.println("l=" + l);
        System.out.println("b=" + b);
        double area = l * b ;
        System.out.println("area =" + area);
    }

    void printDetails (int rno, String name, double percentage)
    {
        System.out.println("name =" + name);
        System.out.println("rno =" + rno);
        System.out.println("percentage  =" + percentage);
    }

    void printEvenNumberFromArray (int[] arr)
    {
        System.out.println("all even number from Array");

        for(int i=0; i<arr.length;i++)
        {
            if (arr[i]%2 == 0)
                System.out.print(arr[i] + " ");
        } System.out.println();
    }

    void printTwoDArray (String [][] stArr) {
        for (int i = 0; i < stArr.length; i++) {
            for (int j = 0; j < stArr[0].length; j++) {
                System.out.print(stArr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        MethodsWithArguments ob = new MethodsWithArguments();

        ob.areaCircle(45);
        ob.areaRectangle(30,83);
        ob.printDetails(45, "Vishal", 98 );

        int[] a = {78, 92, 99, 27, 3, 22, 46,82,43,45,76,77,97} ;

        ob.printEvenNumberFromArray(a);

        String[][] st = { {"Apple", "Banana", "Cherry", "Date", "Elderberry"},
                {"Fig", "Grape", "Honeydew", "Iced Tea", "Jackfruit"},
                {"Kiwi", "Lemon", "Mango", "Nectarine", "Orange"},
                {"Papaya", "Quince", "Raspberry", "Strawberry", "Tomato"}};

        ob.printTwoDArray(st);

    }
}
