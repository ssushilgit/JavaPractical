package Practical;

public class FinalVariableExample {
    // Declaring a final variable
    final int MAX_VALUE = 100;

    // Constructor to initialize final variable
    public FinalVariableExample() {
        // Cannot reassign value to a final variable
        // MAX_VALUE = 200; // This will result in a compilation error
    }

    // Method to demonstrate usage of final variable
    void printMaxValue() {
        System.out.println("Maximum value: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        obj.printMaxValue();
    }
}
