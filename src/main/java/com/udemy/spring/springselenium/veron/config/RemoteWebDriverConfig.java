package com.udemy.spring.springselenium.veron.config;

import com.udemy.spring.springselenium.veron.annotation.LazyConfiguration;
import com.udemy.spring.springselenium.veron.annotation.ThreadScopeBean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;

import java.net.URL;
import java.util.Map;

/**
 * Created by Nikasan
 */
@LazyConfiguration
@Profile("remote")
public class RemoteWebDriverConfig {

    @Value("${selenium.grid.url}")
    private URL url;

    @Value("${mode}")
    private boolean mode;

    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "edge")
    public WebDriver remoteEdgeDriver() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setCapability("browserName", "MicrosoftEdge");
        edgeOptions.setCapability("browserVersion", "latest");
<<<<<<< HEAD
//        edgeOptions.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", true,
//                "enableVideo", true
//        ));
=======
        edgeOptions.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
        if(mode){
            edgeOptions.setHeadless(true);
        }
        return new RemoteWebDriver(this.url, edgeOptions);
    }

    @ThreadScopeBean
    @ConditionalOnMissingBean
    public WebDriver remoteChromeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserName", "chrome");
        chromeOptions.setCapability("browserVersion", "96.0");
<<<<<<< HEAD
        chromeOptions.setCapability("se.vncEnabled", true);
//        chromeOptions.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", true,
//                "enableVideo", true
//        ));
        if(mode){
            chromeOptions.setHeadless(true);
        }
        chromeOptions.addArguments("--start-maximized");
=======
        chromeOptions.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        if(mode){
            chromeOptions.setHeadless(true);
        }
>>>>>>> 327af98ac7253cda78c5e7b81d648e9fc23538aa
        return new RemoteWebDriver(this.url, chromeOptions);
    }
}
