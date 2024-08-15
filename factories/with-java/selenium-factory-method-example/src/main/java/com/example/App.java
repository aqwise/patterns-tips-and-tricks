package com.example;

import com.example.factory.*;
import com.example.selenium.WebDriver;

public class App {
    public static void main(String[] args) {
        WebDriverFactory factory = new WebDriverFactory();

        // Create ChromeDriver
        WebDriver chromeDriver = factory.createWebDriver(ChromeDriverType.class);
        chromeDriver.get("https://www.example.com");
        System.out.println("Title: " + chromeDriver.getTitle());

        // Create FirefoxDriver
        WebDriver firefoxDriver = factory.createWebDriver(FirefoxDriverType.class);
        firefoxDriver.get("https://www.example.com");
        System.out.println("Title: " + firefoxDriver.getTitle());
    }
}
