package com.employment.jpa.relationships;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeManyToOne {

    private long id;

    @ManyToOne
    @JoinColumn(name = "DEPT_ID")
    private Department department;

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
