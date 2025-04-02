package examples.search;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("John",LocalDate.of(2000,1,1)));
        persons.add(new Person("Jane",LocalDate.of(1993,1,1)));
        persons.add(new Person("Bob",LocalDate.of(2010,1,1)));

        Person personToSearch = new Person("John",LocalDate.of(2000,1,1));

        System.out.println(persons.contains(personToSearch));

        int index = persons.indexOf(personToSearch);
        if (index > -1) {
            System.out.println(persons.get(index));
        }

        System.out.println(persons);

        Collections.sort(persons);
        System.out.println(persons);
    }
}
