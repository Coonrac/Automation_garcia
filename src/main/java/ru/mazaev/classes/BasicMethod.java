package ru.mazaev.classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicMethod {
    public static WebDriver webDriver;

    public void Setup(String url){
        WebDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
    }

    public void CloseDriver(){
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
