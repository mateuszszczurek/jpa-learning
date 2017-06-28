package com.employment.jee.ejb.session_beans;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import java.util.logging.Logger;

/**
 * Showcase of stateless session bean related annotations
 */
@Stateless
public class HelloService {

    private Logger logger;

    @PostConstruct
    void init() {
        logger = Logger.getLogger("notification");
    }

    public void logMessage(String message) {
        logger.info(message);
    }

}
