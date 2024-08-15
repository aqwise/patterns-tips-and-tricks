package com.example.selenium;

public final class ChromeDriver implements WebDriver {
    public ChromeDriver() {
        // Initialize ChromeDriver specific settings here
        System.out.println("ChromeDriver initialized.");
    }

    @Override
    public void get(String url) {
        System.out.println("Navigating to " + url + " using ChromeDriver");
    }

    @Override
    public String getTitle() {
        return "Title from ChromeDriver";
    }
}
