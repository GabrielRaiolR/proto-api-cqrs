package com.course.cqrs.proto_api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String id;
    private String fullName;
    private Date birthDate;
    private Integer age;
}

