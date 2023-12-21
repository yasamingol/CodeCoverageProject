package com.unittest.codecoverage.validators;

import com.unittest.codecoverage.models.Gender;
import com.unittest.codecoverage.models.Person;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PersonTest {


    @Test
    public void testGetName_shouldReturnDefaultValue() {
        Person person = new Person();

        String result = person.getName();

        assertThat(result).isNull();
    }

    @Test
    public void testSetName_shouldSetCorrectValue() {
        Person person = new Person();

        person.setName("Yasmin Kate");

        assertThat(person.getName()).isEqualTo("Yasmin Kate");
    }

    @Test
    public void testGetAge_shouldReturnDefaultValue() {
        Person person = new Person();

        int result = person.getAge();

        assertThat(result).isZero();
    }

    @Test
    public void testSetAge_shouldSetCorrectValue() {
        Person person = new Person();

        person.setAge(22);

        assertThat(person.getAge()).isEqualTo(22);
    }

    @Test
    public void testGetGender_shouldReturnDefaultValue() {
        Person person = new Person();

        Gender result = person.getGender();

        assertThat(result).isNull();
    }

}
