package com.employment.jpa.v1_entities;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
public class EmployeeTransientField {

    private static final String LOCAL_AREA_CODE = "+12";

    @Id
    private String id;

    // need to be transient, so that the same field is not persisted twice
    // here we want the getPhoneNumberForDb to store data to PHONE column, not phoneNum
    @Transient
    private String phoneNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Access(AccessType.PROPERTY) @Column(name = "PHONE")
    protected String getPhoneNumberForDb() {
        if(phoneNum.length() ==10){
            return phoneNum;
        }
        return LOCAL_AREA_CODE + phoneNum;
    }

    protected void setPhoneNumberForDb(String num) {
        if(num.startsWith(LOCAL_AREA_CODE)) {
            phoneNum = num.substring(3);
        }

        phoneNum = num;
    }

}
