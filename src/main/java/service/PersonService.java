package service;

import domain.Person;

import java.util.List;

public class PersonService {

    private Person person1 = new Person("bob", 20);
    private Person person2 = new Person("john", 25);

    private List<Person> persons = List.of(person1, person2);

    public Person findPersonByAge(int age) {
        return persons.stream().filter( person -> person.getAge().equals(age)).findFirst().orElse(null);
    }

}
