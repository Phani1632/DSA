package Polymorphism;

public class polymorphism {

    public static void main(String[] args) {
        // Polymorphism in Java
        // 1. Compile-time Polymorphism (Method Overloading)
        // 2. Runtime Polymorphism (Method Overriding)

        // Compile-time Polymorphism

        // Runtime Polymorphism
        Animal myDog = new Dog();
        Animal myanimal = new Animal();        
        Animal myCat = new Cat();
        
        myanimal.makesound();
        myDog.makesound(); // Output: Woof!        
        myCat.makesound(); // Output: Meow!
    }
}