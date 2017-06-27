package com.employment.actions;

import com.employment.salaries.Employee;
import com.employment.salaries.EmployeeService;

import javax.persistence.EntityManager;
import java.util.List;

public class Action {

    public void perform(EntityManager em) throws InterruptedException {
        em.getTransaction().begin();

        new SomeData().setupData(em);

        EmployeeService employeeAccess = new EmployeeService(em);
        List<Employee> employesWithSalaryHigherThan = employeeAccess.findEmployesWithSalaryHigherThan(150);

        employesWithSalaryHigherThan.forEach(System.out::println);
        em.getTransaction().commit();;


    }

    private void spitOut(Employee em) {
        System.out.println(em.toString());
    }

    public static class SomeData {

        public void setupData(EntityManager em) {
            Employee employee1 = new Employee(1);
            employee1.setName("Mateusz");
            employee1.setSalary(100);

            Employee employee2 = new Employee(2);
            employee2.setName("Mateusz");
            employee2.setSalary(200);

            Employee employee3 = new Employee(3);
            employee3.setName("Mateusz");
            employee3.setSalary(300);

            em.persist(employee1);
            em.persist(employee2);
            em.persist(employee3);
        }

    }
}
