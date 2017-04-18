package ua.com.codespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.com.codespace.config.SpringConfig;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Dog dog = applicationContext.getBean(Dog.class);
        dog.say();
    }
}
