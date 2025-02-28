package inheritance.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.bark();
        dog.setName("Fido");
        System.out.println(dog.getName());
    }
}
