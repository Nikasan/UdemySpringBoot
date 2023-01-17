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
<<<<<<< HEAD
@Lazy
=======
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
public class SeniorEng {
    public Salary getSalary() {
        return salary;
    }

<<<<<<< HEAD
    SeniorEng(){
        System.out.println("SeniorEng constructor");
    }

    @Autowired
    @Lazy
=======
    @Autowired
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
    private Salary salary;

    public void setAmount(int amount){
        this.salary.setAmount(amount);
    }
}
