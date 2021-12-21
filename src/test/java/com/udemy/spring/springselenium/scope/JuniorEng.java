package com.udemy.spring.springselenium.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Nikasan
 */
@Component
public class JuniorEng {

    public Salary getSalary() {
        return salary;
    }

    @Autowired
    private Salary salary;

    public void setAmount(int amount){
        this.salary.setAmount(amount);
    }

}
