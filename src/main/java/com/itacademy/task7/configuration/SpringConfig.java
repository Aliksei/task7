package com.itacademy.task7.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.itacademy.task7")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
