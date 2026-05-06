package org.launchcode.java.demos.lsn6inheritance;

// 1. We define a Functional Interface (Polymorphism starts here!)
@FunctionalInterface
interface Greeting {
    void sayMessage(String name);
}

// 2. A traditional class implementing the interface (Standard Polymorphism)
class FormalGreeting implements Greeting {
    @Override
    public void sayMessage(String name) {
        System.out.println("Good day, " + name + ". It is a pleasure to meet you.");
    }
}

public class lambdaPolymorphismDemo {
    public static void main(String[] args) {
        // --- POLYMORPHISM IN ACTION ---
        // We use the same interface type 'Greeting' for different implementations

        // Form 1: Using a standard class
        Greeting formal = new FormalGreeting();

        // Form 2: Using the Lambda Operator '->' (Concise implementation)
        // We don't need a separate class; we just define the behavior here!
        Greeting casual = (a) -> System.out.println("Yo, " + a + "! What's up?");

        // Form 3: Another Lambda with multiple lines
        Greeting pirate = (a ) -> {
            String message = "Ahoy, " + a + "!";
            System.out.println(message + " Prepare to be boarded!");
        };

        // Execution: The same method call produces different results (Polymorphic behavior)
        System.out.println("--- Testing Behaviors ---");
        executeGreeting(formal, "Alice");
        executeGreeting(casual, "Bob");
        executeGreeting(pirate, "Charlie");
    }

    // This method is truly polymorphic: it accepts ANY implementation of Greeting
    public static void executeGreeting(Greeting greetingType, String name) {
        greetingType.sayMessage(name);
    }
}