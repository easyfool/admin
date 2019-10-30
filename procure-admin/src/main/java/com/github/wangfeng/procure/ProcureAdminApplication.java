package com.github.wangfeng.procure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ProcureAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProcureAdminApplication.class, args);
    }

}
