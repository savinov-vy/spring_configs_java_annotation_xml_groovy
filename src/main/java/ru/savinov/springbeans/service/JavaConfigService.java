package ru.savinov.springbeans.service;

/**
 * этот класс сконфигурирован в JavaConfig
 */
public class JavaConfigService {

    private final String timeOfInitialization;

    private Integer dayOfmonth;

    public JavaConfigService(String timeOfInitialization) {
        this.timeOfInitialization = timeOfInitialization;
    }

    public void setDayOfmonth(Integer dayOfmonth) {
        this.dayOfmonth = dayOfmonth;
    }

    public String hello() {
        return "Hello from java config" + " time: " + timeOfInitialization +
                " dayOfMonth: " + dayOfmonth;
    }
}
