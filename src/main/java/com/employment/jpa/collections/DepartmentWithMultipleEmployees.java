package com.employment.jpa.collections;

import com.employment.salaries.Employee;

import javax.persistence.*;
import java.util.Map;

@Entity
public class DepartmentWithMultipleEmployees {

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToMany
    @JoinTable(name = "DEPT_EMP",
            joinColumns = @JoinColumn(name = "DEPT_ID"),
            inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID")
    )
    @MapKeyColumn("CUB_ID")
    private Map<String, Employee> employeesFromThisDepartment;

}
