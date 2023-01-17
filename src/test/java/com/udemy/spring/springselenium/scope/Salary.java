package com.udemy.spring.springselenium.scope;

<<<<<<< HEAD
import org.springframework.context.annotation.Lazy;
=======
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Nikasan
 */
@Component
@Scope("prototype")
public class Salary {

<<<<<<< HEAD
    Salary(){
        System.out.println("Salary constructor");
    }

=======
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
    public int getAmount() {
        return amount;
    }

<<<<<<< HEAD
    private int amount;

    @Override
    public String toString() {
        return "Salary{" +
                "amount=" + amount +
                '}';
    }

=======
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
    public void setAmount(int amount) {
        this.amount = amount;
    }

<<<<<<< HEAD
=======
    private int amount;

>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
}
