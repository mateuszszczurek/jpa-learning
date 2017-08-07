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
//    @MapKeyEnumerated(EnumType.STRING) -> This could be used if key of the map would be an enum. For value @Enumerated can be used.
    private Map<String, String> phoneNumbers;

    public enum PhoneType { Home, Mobile, Work}

}
