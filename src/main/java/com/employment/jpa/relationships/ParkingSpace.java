package com.employment.jpa.relationships;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class ParkingSpace {

    @Id
    @GeneratedValue(strategy = AUTO)
    private String id;

    @OneToOne
    @JoinColumn(name = "PSPACE_ID")
    private ParkingSpace parkingSpace;

    public String getId() {
        return id;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

}
