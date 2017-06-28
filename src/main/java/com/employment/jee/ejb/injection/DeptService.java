package com.employment.jee.ejb.injection;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 * example of injection using cdi (context and dependency injection)
 */
@Stateless
public class DeptService {

    // field dependency injection
    @Inject
    AuditService audit;

    // setter injection
    @Inject
    public void setAudit(AuditService audit) {
        this.audit = audit;
    }

    // constructor injection
    @Inject
    public DeptService(AuditService audit) {
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
