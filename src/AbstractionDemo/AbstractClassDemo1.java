package AbstractionDemo;

import javax.sound.midi.Soundbank;

public abstract class AbstractClassDemo1 {

    // Abstract Method
    abstract void run();  // declared method

    abstract void start();

    void display()   //Non- abstract Method  // define method ( Have body)
    {
        System.out.println("this is display");
    }

    public static void main(String[] args) {

        AbstractClassDemo1 ob = new ChildAbstract(); // If user write abstract keyword with any class then that
                                                     // Abstract class object cannot be created in main function.
        ob.run();
        ob.display();
        ob.start();
    }


}

class ChildAbstract extends AbstractClassDemo1{ // when use inheritance in Abstract class then
                                               // all abstract methods should be declared in child class

    void run()  // OverRidden Methods
    {
        System.out.println("run");
    }
    void start() // OverRidden Methods
    {
        System.out.println("start");
    }


}
