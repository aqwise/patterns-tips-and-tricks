package com.example.selenium;

public sealed interface WebDriver permits ChromeDriver, FirefoxDriver {
    void get(String url);
    String getTitle();
}
