package examples.interfaces;

public class Dog implements Animal{
    private transient String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat() {

    }
}
