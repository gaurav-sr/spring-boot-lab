package com.codei.rest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @SpringBootApplication encompasses @Configuration, @EnableAutoConfiguration and @ComponentScan
 */
@SpringBootApplication
public class PaymentApp {

    @Bean
    public UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(User.withUsername("gaurav")
        .password("password1x23")
        .roles("USER")
        .build());
    }

    public static void main(String[] args) {
        SpringApplication.run(PaymentApp.class, args);
    }

}
