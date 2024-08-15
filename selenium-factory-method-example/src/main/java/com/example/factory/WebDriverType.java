package com.example.factory;

public sealed interface WebDriverType permits ChromeDriverType, FirefoxDriverType {
}
