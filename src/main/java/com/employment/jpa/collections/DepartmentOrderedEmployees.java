package com.employment.jpa.collections;

import com.employment.salaries.Employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import java.util.List;

@Entity
public class DepartmentOrderedEmployees {

    @Id
    private String id;

    @OneToMany(mappedBy = "department")
    @OrderBy("name ASC")
    private List<Employee> employees;

//    Example when name would be a part of object embedded into employee called info
//    @OneToMany(mappedBy = "department")
//    @OrderBy("info.name ASC")
//    private List<Employee> employees;

//    Example of multiple order by attributes
//    @OneToMany(mappedBy = "department")
//    @OrderBy("name ASC, status DESC")
//    private List<Employee> employees;

//    Note - attribute used in @OrderBy needs to be comparable

}
