package examples.polymorphism.animals;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog making sound");
    }

    @Override
    public void printDetails() {
        System.out.println("This is a Dog object");
    }

    public void bark() {
        System.out.println("Woof woof");
    }
}
