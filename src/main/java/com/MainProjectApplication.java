package org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScans;

/**
 * Hello world!
 *
 */
@ComponentScan(basePackages = {"org"})
@SpringBootApplication
public class MainProjectApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(MainProjectApplication.class,args);
    }
}
