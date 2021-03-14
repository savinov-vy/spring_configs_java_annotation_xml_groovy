package ru.savinov.springbeans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.savinov.springbeans.service.JavaConfigService;

import java.time.OffsetDateTime;

@Configuration
public class JavaConfig {

    @Bean
    public JavaConfigService javaConfigService() {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        JavaConfigService javaConfigService = new JavaConfigService(offsetDateTime.toString());
        javaConfigService.setDayOfmonth(offsetDateTime.getDayOfMonth());
        return javaConfigService;
    }

}
