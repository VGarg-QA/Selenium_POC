package Inheritance.HybridInheritance;

class Animal {

    void eat(){
        System.out.println("eat");

    }
}

class Reptile extends Animal {

    void crawl(){
        System.out.println("crawl");

    }
}

class Mamal extends Animal {

    void walk(){
        System.out.println("walk");

    }
}
class Tiger extends Mamal {

    void roar(){
        System.out.println("roar");

    }
}

public class TestHybridInheritance {
    public static void main(String[] args) {
        Animal A = new Animal();
        A.eat();

        Reptile R = new Reptile();
        R.crawl();
        R.eat();

        Mamal M = new Mamal();
        M.walk();
        M.eat();

        Tiger T = new Tiger();
        T.roar();
        T.walk();
        T.eat();

    }
}
