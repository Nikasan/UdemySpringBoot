package com.udemy.spring.springselenium.veron.scope;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Nikasan
 */
@Configuration
public class BrowserScopeConfig {

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor()
    {
        return new BrowserScopePostProcessor();
    }
}
