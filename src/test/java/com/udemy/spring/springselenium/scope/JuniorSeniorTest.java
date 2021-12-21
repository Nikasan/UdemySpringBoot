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
    private SeniorEng senior;

    @Test
    public void scopeTest(){
        this.junior.setAmount(100);
        System.out.println("Junior:: " + junior.getSalary().getAmount());
        this.senior.setAmount(200);
        System.out.println("Senior:: " + senior.getSalary().getAmount());
        System.out.println("Junior:: " + junior.getSalary().getAmount());
    }
}
