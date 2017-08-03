package com.employment.jpa.v1_entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
public class EmployeeTemporal {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // temporal types that are supported out of box
    // java.sql.Date, java.sql.Time, java.sql.Timestamp, java.util.Date and java.util.Calendar

    // we use the temporal annotation to indicate which
    // java.sql type should be used to while persisting attributes
    @Temporal(TemporalType.DATE)
    private Calendar dob;

    @Temporal(TemporalType.DATE)
    @Column(name = "S_DATE")
    private Date startDate;

}
