package com.udemy.spring.springselenium.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Nikasan
 */
@Component
@Scope("prototype")
public class Salary {

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int amount;

}
