package com.udemy.spring.springselenium.veron.config;

import com.udemy.spring.springselenium.veron.annotation.LazyConfiguration;
import com.udemy.spring.springselenium.veron.annotation.ThreadScopeBean;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
<<<<<<< HEAD
import org.openqa.selenium.chromium.ChromiumOptions;
=======
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
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
<<<<<<< HEAD
        edgeOptions.addArguments("--start-maximized");
        return new EdgeDriver(edgeOptions);
=======
        return new EdgeDriver();
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
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
<<<<<<< HEAD
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }

=======
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(" Started " + threads + " threads");
        return new ChromeDriver(options);
    }
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
}
