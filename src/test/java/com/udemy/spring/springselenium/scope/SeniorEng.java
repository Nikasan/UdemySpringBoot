package com.udemy.spring.springselenium.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by Nikasan
 */
@Component
@Lazy
public class SeniorEng {
    public Salary getSalary() {
        return salary;
    }

    SeniorEng(){
        System.out.println("SeniorEng constructor");
    }

    @Autowired
    @Lazy
    private Salary salary;

    public void setAmount(int amount){
        this.salary.setAmount(amount);
    }
}
