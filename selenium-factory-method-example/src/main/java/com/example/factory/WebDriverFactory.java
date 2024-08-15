package com.example.factory;

import com.example.selenium.ChromeDriver;
import com.example.selenium.FirefoxDriver;
import com.example.selenium.WebDriver;

public class WebDriverFactory {

    // Method to create WebDriver instances based on the provided Class<? extends WebDriver>
    public WebDriver createWebDriver(Class<? extends WebDriverType> driverClass) {
        try {
            if (WebDriverType.class.isAssignableFrom(driverClass)) {
                return switch (driverClass.getSimpleName()) {
                    case "ChromeDriverType" -> new ChromeDriver();
                    case "FirefoxDriverType" -> new FirefoxDriver();
                    default -> throw new IllegalArgumentException("Unsupported driver type: " + driverClass.getName());
                };
            } else {
                throw new IllegalArgumentException("Unsupported driver type: " + driverClass.getName());
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to create WebDriver instance for type: " + driverClass.getName(), e);
        }
    }
}
