package com.udemy.spring.springselenium.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by Nikasan
 */
@Component
public class JuniorEng {

    private Salary salary;

    JuniorEng() {
        System.out.println("JuniorEng constructor");
    }

    public Salary getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "JuniorEng{" +
                "salary=" + salary +
                '}';
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
