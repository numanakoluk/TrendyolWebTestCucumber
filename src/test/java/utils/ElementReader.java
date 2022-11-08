package utils;

import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ElementReader {
    private static Properties properties;

    public ElementReader(String fileName) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/test/resources/" + fileName + ".properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("@@@@@File is not found@@@@@");
        }
        properties = new Properties();
        try {
            properties.load(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public By getElementValue(String locatorName) {
        String locatorProperty = properties.getProperty(locatorName);
        String locatorType = locatorProperty.split(":")[0];
        String locatorValue = locatorProperty.split(":")[1];

        By locator = null;
        switch (locatorType) {
            case "id":
                locator = By.id(locatorValue);
                break;
            case "className":
                locator = By.name(locatorValue);
                break;
            case "cssSelector":
                locator = By.cssSelector(locatorValue);
                break;
            case "linkText":
                locator = By.linkText(locatorValue);
                break;
            case "tagName":
                locator = By.tagName(locatorValue);
                break;
            case "xpath":
                locator = By.xpath(locatorValue);
                break;
        }
        if (locator != null) return locator;
        else throw new RuntimeException("@@@@@Element is not found@@@@@");
    }
}
