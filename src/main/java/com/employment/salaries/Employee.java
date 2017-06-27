package com.employment.salaries;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Employee {

    @Id
    private int id;
    private String name;
    private long salary;

    public Employee(int id) {
        this.id = id;
    }

}
