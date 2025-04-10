package examples.exceptions.checked;

public class Person {
    private String name;

    public Person(String name) throws ParseException {
        if (name == null || name.isEmpty()) {
            throw new ParseException("Kunne ikke oprette objektet");
        }
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
