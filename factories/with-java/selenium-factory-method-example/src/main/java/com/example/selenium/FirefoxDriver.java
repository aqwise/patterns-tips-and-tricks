package com.example.selenium;

public final class FirefoxDriver implements WebDriver {
    public FirefoxDriver() {
        // Initialize FirefoxDriver specific settings here
        System.out.println("FirefoxDriver initialized.");
    }

    @Override
    public void get(String url) {
        System.out.println("Navigating to " + url + " using FirefoxDriver");
    }

    @Override
    public String getTitle() {
        return "Title from FirefoxDriver";
    }
}
