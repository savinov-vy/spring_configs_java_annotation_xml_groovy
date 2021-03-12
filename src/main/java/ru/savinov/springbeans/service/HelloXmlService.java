package ru.savinov.springbeans.service;

public class HelloXmlService {

    private UtilService utilService;

    public UtilService getUtilService() {
        return utilService;
    }

    public void setUtilService(UtilService utilService) {
        this.utilService = utilService;
    }

    public String getHelloXml() {
        return utilService.append("Hello from xml");
    }
}
