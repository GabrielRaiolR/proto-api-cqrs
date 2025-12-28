package com.course.cqrs.proto_api.services.impl;

import com.course.cqrs.proto_api.models.Person;
import com.course.cqrs.proto_api.services.PeopleService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PeopleServiceImpl implements PeopleService {

    private final List<Person> listOfPeople = new ArrayList<>();

    private final Faker faker = new Faker();


    @Override
    public List<Person> getPeople() {
        return listOfPeople;
    }

    @Override
    public Optional<Person> getPersonBy(String id) {
        return Optional.empty();
    }

    @Override
    public Person createPerson(Person person) {
        return null;
    }

    @Override
    public Person updatePerson(String id, Person person) {
        return null;
    }

    @Override
    public void deletePerson(String id) {

    }

    @Override
    public List<Person> getPeopleByName(String name) {
        return List.of();
    }

    @Override
    public void generatePeople(Integer quantity) {
        if (quantity <= 0) return;

        listOfPeople.clear();

        for (int i = 0; i < quantity; i++) {
            Person person = Person.builder()
                    .id(UUID.randomUUID().toString())
                    .fullName(faker.name().fullName())
                    .birthDate(faker.date().birthday())
                    .age(faker.number().numberBetween(1, 100))
                    .build();

            listOfPeople.add(person);
        }
    }

}
