package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.library_management_system")
@EntityScan(basePackages = "com.library_management_system.entity")
@SpringBootApplication

public class MainProjectApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(MainProjectApplication.class,args);
    }
}
