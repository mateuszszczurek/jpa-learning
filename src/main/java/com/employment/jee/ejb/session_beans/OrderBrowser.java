package com.employment.jee.ejb.session_beans;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Showcase of stateful session bean related lifecycle annotations
 */
@Stateful
public class OrderBrowser {

    DataSource ds;
    Connection connection;

    @PostConstruct
    void init() {
        // ...

        aquireConnection();
    }

    @PrePassivate
    void passivate() {
        releaseConnection();
    }

    @PostActivate
    void activate() {
        aquireConnection();
    }

    private void aquireConnection() {
        try {
            connection = ds.getConnection();
        } catch (SQLException e) {
            throw new EJBException(e);
        }
    }

    private void releaseConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
        } finally {
            connection = null;
        }
    }

    @Remove
    public void remove() {
        // ...
    }


}
