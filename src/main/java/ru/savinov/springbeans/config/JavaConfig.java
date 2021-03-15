package ru.savinov.springbeans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ru.savinov.springbeans.service.JavaConfigService;

import java.time.OffsetDateTime;

@Configuration
public class JavaConfig {
    OffsetDateTime offsetDateTime = OffsetDateTime.now();

    @Bean("fullJavaConfigService")
    public JavaConfigService javaConfigService() {
        JavaConfigService javaConfigService = new JavaConfigService(offsetDateTime.toString());
        javaConfigService.setDayOfmonth(offsetDateTime.getDayOfMonth());
        return javaConfigService;
    }
    @Bean("pureJavaConfigService")
    @Primary //при отсутствии аннотации @Qualifier этому бину будет отдано предпочтение среди бинов одного типа
    public JavaConfigService javaConfigService1() {
        JavaConfigService javaConfigService = new JavaConfigService(offsetDateTime.toString());
        return javaConfigService;
    }

}
