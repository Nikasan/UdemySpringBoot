package com.udemy.spring.springselenium.veron.config;

import com.github.javafaker.Faker;
import com.udemy.spring.springselenium.veron.annotation.LazyConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by Nikasan
 */
@LazyConfiguration
public class FakerConfig {

    @Bean
    public Faker getFaker(){
        return new Faker();
    }

}
