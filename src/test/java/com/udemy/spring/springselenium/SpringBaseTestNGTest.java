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
}
