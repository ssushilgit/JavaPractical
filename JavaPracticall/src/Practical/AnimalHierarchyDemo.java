package Practical;

// Superclass class Animal
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass: Mammal
class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public void giveBirth() {
        System.out.println(getName() + " is giving birth to live young.");
    }
}

// Subclass: Bird
class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}

// Subclass: Fish
class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}

// Main program
public class AnimalHierarchyDemo {

    public static void main(String[] args) {
        Mammal dog = new Mammal("Dog");
        Bird eagle = new Bird("Eagle");
        Fish salmon = new Fish("Salmon");

        // Demonstrating inheritance and polymorphism
        System.out.println("Animal Hierarchy Demo:");
        System.out.println("----------------------");

        // Mammal
        System.out.println("Mammal:");
        System.out.println("Name: " + dog.getName());
        dog.eat();
        dog.sleep();
        dog.giveBirth(); // Can call mammal specific method
        System.out.println();

        // Bird
        System.out.println("Bird:");
        System.out.println("Name: " + eagle.getName());
        eagle.eat();
        eagle.sleep();
        eagle.fly(); // Can call bird specific method
        System.out.println();

        // Fish
        System.out.println("Fish:");
        System.out.println("Name: " + salmon.getName());
        salmon.eat();
        salmon.sleep();
        salmon.swim(); // Can call fish specific method
    }
}

