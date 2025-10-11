// All classes in one file: AnimalTest.java

interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}