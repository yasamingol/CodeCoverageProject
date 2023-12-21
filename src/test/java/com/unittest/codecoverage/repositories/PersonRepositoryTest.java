package com.unittest.codecoverage.repositories;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import com.unittest.codecoverage.models.Person;

public class PersonRepositoryTest {

    @Test
    public void testInsert_shouldReturnPerson() {
        PersonRepository repository = new PersonRepository();
        Person person = new Person();
        person.setName("Meow WoeM");

        Person result = repository.insert(person);

        assertThat(result).isNotNull().isEqualTo(person);
    }

    @Test
    public void testInsert_withNullPerson_shouldThrowNullPointerException() {
        PersonRepository repository = new PersonRepository();

        assertThatThrownBy(() -> repository.insert(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("person can't be null");
    }

    @Test
    public void testUpdate_withValidPerson_shouldNotThrowException() {
        PersonRepository repository = new PersonRepository();
        Person person = new Person();
        person.setName("Yasmin Kad");

        assertThatCode(() -> repository.update(person)).doesNotThrowAnyException();
    }

    @Test
    public void testUpdate_withNullPerson_shouldThrowNullPointerException() {
        PersonRepository repository = new PersonRepository();

        assertThatThrownBy(() -> repository.update(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("person can't be null");
    }

    @Test
    public void testDelete_withValidName_shouldNotThrowException() {
        PersonRepository repository = new PersonRepository();
        String name = "Yasamin Gol";

        assertThatCode(() -> repository.delete(name)).doesNotThrowAnyException();
    }

    @Test
    public void testDelete_withNullName_shouldThrowNullPointerException() {
        PersonRepository repository = new PersonRepository();

        assertThatThrownBy(() -> repository.delete(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("name can't be null");
    }

    @Test
    public void testGet_withValidName_shouldReturnNull() {
        PersonRepository repository = new PersonRepository();
        String name = "Chai Nabat";

        Person result = repository.get(name);

        assertThat(result).isNull();
    }

    @Test
    public void testGet_withNullName_shouldThrowNullPointerException() {
        PersonRepository repository = new PersonRepository();

        assertThatThrownBy(() -> repository.get(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("name can't be null");
    }
}
