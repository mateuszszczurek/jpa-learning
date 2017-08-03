package com.employment.jpa.collections;

import javax.persistence.*;
import java.util.Map;

@Entity
public class EmployeeMapWithBasicType {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ElementCollection
    @CollectionTable(name = "EMP_PHONE")
    @MapKeyColumn(name = "PHONE_TYPE")
    @Column(name = "PHONE_NUM")
    private Map<String, String> phoneNumbers;

}
