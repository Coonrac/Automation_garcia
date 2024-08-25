package ru.mazaev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_bonigarcia {
    private WebDriver webDriver;

    /* String[] inputs = new String[]{
            "first-name", "last-name", "address",
            "e-mail", "phone", "city", "country",
            "job-position", "company"};

    String[] datas = new String[] {
            "Иван", "Петров", "Ленина, 55-3",
            "test@skypro.com", "+7985899998787",
            "Москва", "Россия", "QA", "SkyPro"
    };
     */

    @Before
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
    }

    @Test
    public void data_types(){
        webDriver.get("https://bonigarcia.dev/selenium-webdriver-java/data-types.html");

    }

    @After
    public void closeDriver(){
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}