package com.employment.jpa.v1_entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EMP", schema = "HR", catalog = "HR")
public class EmployeeTableAnnotation {
}
