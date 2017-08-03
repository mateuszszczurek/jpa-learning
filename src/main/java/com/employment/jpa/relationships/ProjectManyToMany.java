package com.employment.jpa.relationships;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class ProjectManyToMany {

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JoinTable(name = "EMP_PROJ")
    @ManyToMany(
            mappedBy = "projects"
    )
    private Collection<EmployeeManyToMany> employees;

}
