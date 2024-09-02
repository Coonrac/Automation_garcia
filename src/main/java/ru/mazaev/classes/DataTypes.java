package ru.mazaev.classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class DataTypes {
    private WebDriver webDriver;

    public void Setup(String url){
        WebDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
    }

    public void DataTypes(String[] inputs, String[] datas) {
        if (inputs.length == datas.length) {
            for (int num = 0; num < inputs.length; num++) {
                webDriver.findElement(By.name(inputs[num])).sendKeys(datas[num]);
            }
            webDriver.findElement(By.tagName("button")).click();
        }
    }

    public void ValidateResult(String[] inputs){
        for (String input : inputs) {
            String successElement = wbDriver.findElement(By.id(input)).getAttribute("class");
            assert successElement.contains("alert-success");
        }
    }

    public void CloseDriver(){
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
