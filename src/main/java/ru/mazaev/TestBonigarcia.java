package ru.mazaev;

import ru.mazaev.*;
import ru.mazaev.classes.DataTypes;
import org.junit.Test;

public class TestBonigarcia {
    String[] inputs = new String[] {
            "first-name", "last-name", "address",
            "zip-code", "e-mail", "phone", "city",
            "country", "job-position", "company"
    };

    String[] datas = new String[] {
            "Иван", "Петров", "11-я Парковая, 11А-3",
            "1050443", "testemail@example.com", "+7985899998787",
            "Москва", "Россия", "QA", "TestNameCompany"
    };

    @Test
    public void Types(){
        DataTypes DT = new DataTypes();
        DT.Setup("https://bonigarcia.dev/selenium-webdriver-java/data-types.html");
        DT.DataTypes(inputs, datas);
        DT.ValidateResult(inputs);
        DT.CloseDriver();
    }
}