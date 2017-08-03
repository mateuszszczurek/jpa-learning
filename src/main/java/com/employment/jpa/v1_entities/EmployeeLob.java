package com.employment.jpa.v1_entities;

import javax.persistence.*;

@Entity
public class EmployeeLob {

    @Id
    private long id;

    // common practice to mark LOB as 'preferred to be lazily loaded'
    @Basic(fetch = FetchType.LAZY)
    @Lob @Column(name = "PIC")
    private byte[] picture;

}
