package com.udemy.spring.springselenium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by Nikasan
 */
@SpringBootTest
public class SpringBaseTestNGTest extends AbstractTestNGSpringContextTests {
<<<<<<< HEAD
=======

    @Value("${threads}")
    private int threads;

    @BeforeSuite
    public void beforeTestClass(){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(" @BeforeTestClass " + threads + " threads");
    }
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
}
