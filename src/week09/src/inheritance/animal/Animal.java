package inheritance.animal;

public class Animal {
    private String name;
    public void makeSound() {
        System.out.println("Hello from animal class");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
