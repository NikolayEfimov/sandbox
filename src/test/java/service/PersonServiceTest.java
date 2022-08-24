package service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonServiceTest {

    private PersonService personService = new PersonService();

    @Test
    void findPersonByAge() {
        assertThat(personService.findPersonByAge(20).getName()).isEqualTo("bob");

    }
}