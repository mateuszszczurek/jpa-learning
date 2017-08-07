package com.employment.jpa.collections;

import com.employment.salaries.Employee;

import javax.persistence.*;
import java.util.Map;

@Entity
public class DepartmentWithEmbeddableEmployeeName {

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // if case of many to many and join table we want to override the column names used in join column
    // we can do that by using @AttributeOverrides annotiation
    @ManyToMany
    @JoinTable(name = "DEPT_EMP",
            joinColumns = @JoinColumn(name = "DEPT_ID"),
            inverseJoinColumns = @JoinColumn(name = "EMP_ID"))
    @AttributeOverrides({
            @AttributeOverride(name = "name", column = @Column(name = "EMP_NAME")),
            @AttributeOverride(name = "lastName", column = @Column(name = "EMP_LAST_NAME"))
    })
    Map<EmployeeName, Employee> employeeByEmmployeeName;

}

