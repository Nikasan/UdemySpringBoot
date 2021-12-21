package com.udemy.spring.springselenium.googletest;

import com.github.javafaker.Faker;
import com.udemy.spring.springselenium.SpringBaseTestNGTest;
import com.udemy.spring.springselenium.page.google.GooglePage;
import com.udemy.spring.springselenium.veron.service.ScreenShotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Nikasan
 */
public class GoogleTest1 extends SpringBaseTestNGTest {

    @Lazy
    @Autowired
    GooglePage googlePage;

    @Lazy
    @Autowired
    private ScreenShotService screenShotService;

    @Autowired
    private Faker faker;

    @Test
    public void googleTest1() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

//        Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);// Thread.sleep(3000)

        this.googlePage.getSearchComponent().search("Selenium");
//        Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
//        this.screenShotService.takeScreenShot();
        googlePage.close();
    }

}
