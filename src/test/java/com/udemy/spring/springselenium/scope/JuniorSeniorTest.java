package com.udemy.spring.springselenium.scope;

import com.udemy.spring.springselenium.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

/**
 * Created by Nikasan
 */
public class JuniorSeniorTest extends SpringBaseTestNGTest {

    @Autowired
    private JuniorEng junior;

    @Autowired
    private Salary salary;


    @Test
    public void scopeTest() {
        System.out.println("Before invocation");
        salary.setAmount(100);
        junior.setSalary(this.salary);
        System.out.println(junior);
        System.out.println(salary.getAmount());
        salary.setAmount(200);
    }

    @Test
    public void scopeTest2() {
        salary.setAmount(300);
        junior.setSalary(salary);
        System.out.println(junior);
    }

}
