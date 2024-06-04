package FinalNStatic;

public class FinalDemo {

   final int speed =200 ; // We can't change its value

    void change()
    {
        //speed = 300;
    }

    public static void main(String[] args) {
        FinalDemo ob =new FinalDemo();
        ob.change();
        System.out.println(ob.speed);
    }
}
