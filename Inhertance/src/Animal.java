// Animal class (superclass)
public class Animal {
    String name;
    int age;

    // Constructor to initialize name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to simulate eating
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Method to simulate sleeping
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Method to make a generic sound
    public void makeSound() {
        System.out.println(name + " is making a sound.");
    }
}

// Dog class (subclass)
class Dog extends Animal {
    private String breed;

    // Constructor to initialize name, age, and breed
    public Dog(String name, int age, String breed) {
        super(name, age); // Call the superclass constructor
        this.breed = breed;
    }

    // Method specific to Dog class
    public void wagTail() {
        System.out.println(name + " is wagging tail.");
    }

    // Override the makeSound method to bark
    @Override
    public void makeSound() {
        System.out.println(name + " is barking.");
    }
}

// Cat class (subclass)
class Cat extends Animal {
    private boolean isFriendly;

    // Constructor to initialize name, age, and isFriendly
    public Cat(String name, int age, boolean isFriendly) {
        super(name, age); // Call the superclass constructor
        this.isFriendly = isFriendly;
    }

    // Method specific to Cat class
    public void purr() {
        System.out.println(name + " is purring.");
    }

    // Override the makeSound method to meow
    @Override
    public void makeSound() {
        System.out.println(name + " is meowing.");
    }
}

// Main class to run the program
class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, true);

        // Call methods on Dog object
        dog.eat();
        dog.sleep();
        dog.makeSound();
        dog.wagTail();

        System.out.println();

        // Call methods on Cat object
        cat.eat();
        cat.sleep();
        cat.makeSound();
        cat.purr();
    }
}
