package com.employment.jpa.relationships;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class EmployeeUnidirectional {

    @Id
    private long id;

    private String name;

    /**
     * No mappedBy attribute. This indicates that it's unidirectional OneToMany relationship. A join table is required.
     */
    @OneToMany
    @JoinTable(
            name= "EMP_PHONE",
            joinColumns = @JoinColumn(name = "EMP_ID"),
            inverseJoinColumns = @JoinColumn(name = "PHONE_ID")
    )
    private Collection<Phone> phones;

}
