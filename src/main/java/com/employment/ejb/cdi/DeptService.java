package com.employment.ejb.cdi;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

@Stateless
public class DeptService {

    // field dependency injection
    @EJB AuditService audit;

    // setter injection
    @EJB
    public void setAudit(AuditService audit) {
        this.audit = audit;
    }

    // injection of persistence context
    // in case of container environment, a managed proxy will be injected
    @PersistenceContext(unitName = "EmployeeService")
    EntityManager em;
    // ...

    // injection of persistence unit
    // thread safe and doesn't have to be disposed when bean instance is removed
    @PersistenceUnit(unitName = "EmployeeService")
    EntityManagerFactory emf;

}
