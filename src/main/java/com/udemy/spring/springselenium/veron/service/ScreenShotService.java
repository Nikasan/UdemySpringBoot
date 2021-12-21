package com.udemy.spring.springselenium.veron.service;

import com.github.javafaker.Faker;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Created by Nikasan
 */

@Lazy
@Service
public class ScreenShotService {

    @Autowired
    private ApplicationContext ctx;

    @Value("${screenshot.path}")
    private Path path;

    @Autowired
    private Faker faker;

//    @PostConstruct
//    private void init(){
//        for(int i =0; i<10; i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Sleeping.....");
//        }
//    }

    public void takeScreenShot() throws IOException {
        File sourceFile = this.ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourceFile, this.path.resolve(faker.funnyName().name() + ".png").toFile());
    }

}
