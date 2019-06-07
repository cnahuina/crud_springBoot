package com.csti.capacitacion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CapacitacionApplication  {

    private static final Logger log = LoggerFactory.getLogger(CapacitacionApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CapacitacionApplication.class, args);
    }

}