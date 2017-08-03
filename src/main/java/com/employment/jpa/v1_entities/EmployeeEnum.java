package com.employment.jpa.v1_entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class EmployeeEnum {

    @Id
    private long id;

    @Enumerated(EnumType.STRING)
    private EmployeeType employeeType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
