class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Bulldog extends Dog {
    void play() {
        System.out.println("Bulldog is playing.");
    }
}

public class MultiLevelInheritanceExample {
    public static void main(String[] args) {
        Bulldog myBulldog = new Bulldog();

        
        myBulldog.eat();

        
        myBulldog.bark();

        
        myBulldog.play();
    }
}
