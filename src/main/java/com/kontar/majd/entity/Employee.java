package com.kontar.majd.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employee implements Serializable {

    @Id
    private int id;
    private String name;


    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }


    public Employee() {
        super();

    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


}