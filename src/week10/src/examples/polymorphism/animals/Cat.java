package examples.polymorphism.animals;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat making sound");
    }

    @Override
    public void printDetails() {
        System.out.println("This is a Cat object");
    }
}
