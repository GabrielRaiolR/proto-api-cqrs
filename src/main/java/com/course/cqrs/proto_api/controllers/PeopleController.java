package com.course.cqrs.proto_api.controllers;

import com.course.cqrs.proto_api.models.Person;
import com.course.cqrs.proto_api.services.PeopleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/people")
public class PeopleController {

    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @PostMapping("/create-person")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        return ResponseEntity.ok(peopleService.createPerson(person));
    }

    @GetMapping("/")
    public ResponseEntity<List<Person>> getPeople() {
        return ResponseEntity.ok(peopleService.getPeople());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePerson(
            @PathVariable String id,
            @RequestBody Person person) {
        return ResponseEntity.ok(peopleService.updatePerson(id, person));
    }

    @GetMapping("/by-name/{name}")
    public ResponseEntity<List<Person>> getPeopleByName(@PathVariable("name") String name) {
        return ResponseEntity.ok(peopleService.getPeopleByName(name));
    }

}
