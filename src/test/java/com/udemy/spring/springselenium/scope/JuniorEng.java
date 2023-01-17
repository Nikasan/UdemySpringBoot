package com.udemy.spring.springselenium.scope;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.context.annotation.Lazy;
=======
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
import org.springframework.stereotype.Component;

/**
 * Created by Nikasan
 */
@Component
public class JuniorEng {

<<<<<<< HEAD
    private Salary salary;

    JuniorEng() {
        System.out.println("JuniorEng constructor");
    }

=======
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
    public Salary getSalary() {
        return salary;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "JuniorEng{" +
                "salary=" + salary +
                '}';
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
=======
    @Autowired
    private Salary salary;

    public void setAmount(int amount){
        this.salary.setAmount(amount);
    }

>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
}
