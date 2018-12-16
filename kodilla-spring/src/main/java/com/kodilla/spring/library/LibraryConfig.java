package com.kodilla.spring.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {
    @Bean
    public Library library(){
        return new Library(librabryDBController());
    }

    @Bean
    public LibrabryDBController librabryDBController(){
        return new LibrabryDBController();
    }

}
