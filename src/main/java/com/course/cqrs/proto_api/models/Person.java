package com.course.cqrs.proto_api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String id;

    private String fullName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    private Integer age;
}