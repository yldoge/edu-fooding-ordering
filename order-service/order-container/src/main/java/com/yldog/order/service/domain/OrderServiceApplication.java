package com.yldog.order.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
@EnableJpaRepositories(basePackages = "com.yldog.order.service.dataaccess")
@EntityScan(basePackages = "com.yldog.order.service.dataaccess")
@SpringBootApplication(scanBasePackages = "com.yldog")
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
