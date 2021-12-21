package com.udemy.spring.springselenium.veron.config;

import com.udemy.spring.springselenium.veron.annotation.LazyConfiguration;
import com.udemy.spring.springselenium.veron.annotation.ThreadScopeBean;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;

/**
 * Created by Nikasan
 */
@LazyConfiguration
@Profile("!remote")
public class WebDriverConfig {

    @Value("${mode}")
    private boolean mode;

    @Value("${threads}")
    private int threads;

    @ThreadScopeBean
//    @Primary //if we have 2 beans of WebDriver, need to mark one of them as primary
    @ConditionalOnProperty(name = "browser", havingValue = "edge") // read from properties
    public WebDriver edgeDriver() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        if(mode){
            edgeOptions.setHeadless(true);
        }
        return new EdgeDriver();
    }

    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
//    @ConditionalOnMissingBean // необходимо указывать после первого бина
    public WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        if(mode){
            options.setHeadless(true);
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(" Started " + threads + " threads");
        return new ChromeDriver(options);
    }
}
