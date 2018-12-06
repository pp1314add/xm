package com.chuange.aishijing.pojo;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2018-10-16.
 */

@Entity
@Table(name="A_PERSON")
public class Person {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private Integer age;
    private String email;
    private String juzu;

    public String getJuzu() {
        return juzu;
    }

    public void setJuzu(String juzu) {
        this.juzu = juzu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(){};

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
