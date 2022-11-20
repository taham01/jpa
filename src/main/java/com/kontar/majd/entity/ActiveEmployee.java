package com.kontar.majd.entity;
import javax.persistence.*;

@Entity
public class ActiveEmployee extends Employee {

    private int salary;
    private int experience;
    public ActiveEmployee(int id, String name, int salary, int experience) {
        super(id, name);
        this.salary = salary;
        this.experience = experience;
    }
    public ActiveEmployee() {
        super();

    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }



}