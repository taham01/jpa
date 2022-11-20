package com.kontar.majd.entity;

import javax.persistence.*;

@Entity
public class RetiredEmployee extends Employee {

    private int pension;

    public RetiredEmployee(int id, String name, int pension) {
        super(id, name);
        this.pension = pension;
    }

    public RetiredEmployee() {
        super();

    }


    public int getPension() {
        return pension;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }


}