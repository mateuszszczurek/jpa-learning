package com.employment.jpa.relationships;

import javax.persistence.Access;
import javax.persistence.Embeddable;

import static javax.persistence.AccessType.PROPERTY;

@Access(PROPERTY)
@Embeddable
public class AddressEmbedded {

    private String streetName;
    private String houseNumber;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

}
