package com.employment.jpa.relationships;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeEmbeededAddress {

    @Id
    private String id;

    @Embedded
    private AddressEmbedded addressEmbedded;

}
