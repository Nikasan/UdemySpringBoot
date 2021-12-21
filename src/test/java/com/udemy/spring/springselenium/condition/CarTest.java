package com.udemy.spring.springselenium.condition;

import com.udemy.spring.springselenium.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

/**
 * Created by Nikasan
 */
public class CarTest extends SpringBaseTestNGTest {

//    @Autowired// в зависимости от того, какую скорость указать в проперти, такой класс и создастся
    @Autowired
    @Qualifier("civic") // создастся бин Accord, not a good approach
    private Car car;

    @Test
    public void carTest() {
        this.car.run();
    }

}
