package io.pivotal.pal.tracker.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
@ComponentScan("io.pivotal.pal.tracker.zipkin")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
