package io.github.chehsunliu.yen.worker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("Hello World!");
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
