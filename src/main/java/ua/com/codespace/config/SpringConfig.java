package ua.com.codespace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.com.codespace.Dog;

@Configuration
public class SpringConfig {

    @Bean
    public Dog dog() {
        return new Dog();
    }
}
