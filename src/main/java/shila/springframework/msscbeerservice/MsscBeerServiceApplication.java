package shila.springframework.msscbeerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.logging.Logger;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MsscBeerServiceApplication {
    static Logger logger = Logger.getLogger(MsscBeerServiceApplication.class.getName());
    public static void main(String[] args) {
        SpringApplication.run(MsscBeerServiceApplication.class, args);
        logger.info("Hello Intellij");
    }
}
