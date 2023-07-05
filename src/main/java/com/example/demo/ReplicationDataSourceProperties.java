package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class ReplicationDataSourceProperties {
    private String driverClassName;
    private String username;
    private String password;
    private String url;
    private final Map<String, Slave> slaves = new HashMap<>();

    @Getter
    @Setter
    public static class Slave {
        private String name;
        private String driverClassName;
        private String username;
        private String password;
        private String url;
    }
}
