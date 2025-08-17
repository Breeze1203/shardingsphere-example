package org.apache.shardingsphere.example.encrypt;

import org.apache.shardingsphere.example.encrypt.service.ExampleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import java.sql.SQLException;

@EntityScan(basePackages = "org.apache.shardingsphere.example.encrypt.entity")
@SpringBootApplication
public class ExampleMain {
    
    public static void main(final String[] args) throws SQLException {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(ExampleMain.class, args)) {
            ExampleService exampleService = applicationContext.getBean(ExampleService.class);
            exampleService.run();
        }
    }
}
