package com.udemy.spring.springselenium.scope;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Nikasan
 */
@Component
@Scope("prototype")
public class Salary {

    Salary(){
        System.out.println("Salary constructor");
    }

    public int getAmount() {
        return amount;
    }

    private int amount;

    @Override
    public String toString() {
        return "Salary{" +
                "amount=" + amount +
                '}';
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
