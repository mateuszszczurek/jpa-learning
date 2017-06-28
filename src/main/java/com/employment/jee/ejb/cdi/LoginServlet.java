package com.employment.jee.ejb.cdi;

import javax.inject.Inject;

public class LoginServlet {

    @Inject @Secure DeptService deptService;

}
