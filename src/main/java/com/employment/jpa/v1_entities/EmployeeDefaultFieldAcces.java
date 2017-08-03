package com.employment.jpa.v1_entities;

import javax.persistence.*;

@Entity
public class EmployeeDefaultFieldAcces {

    // Id annotation on the field below will trigger the field access mode
    @Id
    private long id;

    @Basic
    @Column(name = "EMP_NAME")
    private String name;

    // .. for seldom access lazy loading can be specified
    // lazy loading is only a hint to the persistence provider
    // this should be rarely used for simple types, only in cases
    // when there might be a performance impact when loading
    // for example hundreds of fields
    @Basic(fetch = FetchType.LAZY)
    private long salary;

}
