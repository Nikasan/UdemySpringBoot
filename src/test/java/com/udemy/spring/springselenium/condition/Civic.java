package com.udemy.spring.springselenium.condition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

/**
 * Created by Nikasan
 */
@Component
//@ConditionalOnExpression("${car.speed} < 70")
@Qualifier("civic")
public class Civic implements Car{


    @Override
    public void run() {
        System.out.println("I am civic. Speed id 60 mph");
    }
}