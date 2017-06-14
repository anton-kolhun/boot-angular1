package com.kolhun.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Person {

    @Id
    private String id;
    private String name;
    private String surname;
}
