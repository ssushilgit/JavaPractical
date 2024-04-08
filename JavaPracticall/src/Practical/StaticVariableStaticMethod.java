package Practical;

public class StaticVariableStaticMethod {
    // Static variable
    static int count = 0;

    // Instance variable
    int instanceCount;

    // Constructor
    StaticVariableStaticMethod() {
        instanceCount = 0;
    }

    // Static method to increment the count variable
    static void incrementCount() {
        count++;
    }

    // Instance method to increment the instanceCount variable
    void incrementInstanceCount() {
        instanceCount++;
    }

    public static void main(String[] args) {
        // Accessing static variable and method using class name
        System.out.println("Initial count value: " + StaticVariableStaticMethod.count);
        StaticVariableStaticMethod.incrementCount();
        System.out.println("Count after increment: " + StaticVariableStaticMethod.count);

        // Creating objects of StaticExample class
        StaticVariableStaticMethod obj1 = new StaticVariableStaticMethod();
        StaticVariableStaticMethod obj2 = new StaticVariableStaticMethod();

        // Accessing instance variables and methods using objects
        System.out.println("Initial instanceCount value for obj1: " + obj1.instanceCount);
        System.out.println("Initial instanceCount value for obj2: " + obj2.instanceCount);
        obj1.incrementInstanceCount();
        System.out.println("InstanceCount for obj1 after increment: " + obj1.instanceCount);
        System.out.println("InstanceCount for obj2 after increment: " + obj2.instanceCount);
    }
}
