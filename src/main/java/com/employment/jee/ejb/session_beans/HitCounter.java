package com.employment.jee.ejb.session_beans;

import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Example singleton bean
 */
@Singleton
@Startup // forcing eager initialization of singleton bean
public class HitCounter {

    int count;

    public void increment() {
        ++count;
    }
    public int getCount() {
        return count;
    }

    public void reset() {
        count = 0;
    }

}
