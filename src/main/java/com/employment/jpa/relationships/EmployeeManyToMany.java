package com.employment.jpa.relationships;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class EmployeeManyToMany {

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToMany
    @JoinTable(
            name = "EMP_PROJ",
            joinColumns = @JoinColumn(name = "EMP_ID"),
            inverseJoinColumns = @JoinColumn(name = "PROJ_ID")
    )
    private Collection<ProjectManyToMany> projects;

}
