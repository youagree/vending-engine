package ru.vending;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class VendingEngineApplication {
    public static void main(String[] args) {
        SpringApplication.run(VendingEngineApplication.class, args);
        log.info("Application successfully start");
    }
}