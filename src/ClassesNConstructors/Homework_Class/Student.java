package ClassesNConstructors.Homework_Class;

public class Student {

    int rno;
    String name;
    String  branch;

    Student()
    {

    }

    void display()
    {
        System.out.println("RollNumber = "+ rno);
        System.out.println("Name = "+ name);
        System.out.println("Branch = "+ branch);

    }

    public static void main(String[] args) {

        Student ob1 = new Student();
        ob1.rno = 12;
        ob1.name = "Vishal Garg";
        ob1.branch = "ECE";
        ob1.display();

        Student ob2 = new Student();
        ob2.rno = 22;
        ob2.name = "Zohan Garg";
        ob2.branch = "CSE";
        ob2.display();
    }

}
