package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("deviceName", "any device name");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", "/Users/kubraatici/Desktop/ApiDemos-debug.apk");

    URL url = new URL("http://127.0.0.1:4723/wd/hub");

    AppiumDriver driver = new AndroidDriver(url, desiredCapabilities);
    String sessionId = driver.getSessionId().toString();
    }
}
