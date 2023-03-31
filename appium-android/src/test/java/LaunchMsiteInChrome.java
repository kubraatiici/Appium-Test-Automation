
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LaunchMsiteInChrome {

    public static void main (String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities androidCaps = new DesiredCapabilities();
        androidCaps.setCapability("appium:deviceName", "Pixel 2 XL API 29");
        androidCaps.setCapability("appium:automationName", "UIAutomator2");
        androidCaps.setCapability("appium:udid", "emulator-5554"); //DeviceId from "adb devices" command
        androidCaps.setCapability("appium:platformName", "Android");
        androidCaps.setCapability("appium:platformVersion", "10.0");
        androidCaps.setCapability("appium:skipUnlock", "true");
        androidCaps.setCapability("appium:app", "/Users/kubraatici/Downloads/game-ui-update.apk");
        androidCaps.setCapability("appium:fullReset", "true");
        androidCaps.setCapability("appium:noReset", "false");
        System.out.println("***** Android App *****");

        URL url =new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver driver=new AndroidDriver(url,androidCaps);
        String sessionId =driver.getSessionId().toString();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


    }

}
