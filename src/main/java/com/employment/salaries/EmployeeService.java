package com.employment.salaries;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class EmployeeService {

    private final EntityManager em;

    public EmployeeService(EntityManager em) {
        this.em = em;
    }

    public Optional<Employee> findById(int id) {
        return Optional.of(em.find(Employee.class, id));
    }

    public void removeEmployee(int id) {
        Employee employee = em.find(Employee.class, id);
        if(employee != null) {
            em.remove(employee);
        }
    }

    public Optional<Employee> raiseSalaryBy(long raise, int id) {
        Optional<Employee> employee = findById(id);
        employee.ifPresent(emp -> emp.setSalary(emp.getSalary() + raise));
        return employee;
    }

    public List<Employee> findEmployesWithSalaryHigherThan(long salary) {
        TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e WHERE e.salary > ?", Employee.class);
        query.setParameter(0, salary);
        return query.getResultList();
    }

}
