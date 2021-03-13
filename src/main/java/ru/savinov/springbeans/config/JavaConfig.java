package ru.savinov.springbeans.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.savinov.springbeans.service.JavaConfigService;

@Configuration
public class JavaConfig {

    @Bean
    public JavaConfigService javaConfigService() {
        return new JavaConfigService();
    }

}
