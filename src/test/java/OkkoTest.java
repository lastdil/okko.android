import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OkkoTest {
    private AppiumDriver<AndroidElement> driver;

    @Before
    public void setUp() throws Exception {
        // set up appium

        File appDir = new File("C:\\Users\\idrygin\\IdeaProjects\\okko.android\\apps");
        File app = new File(appDir, "mobile-googlePlayWidevineAppDrm-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformVersion", "6");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "ru.more.play");
        capabilities.setCapability("appActivity", "ru.more.play.ui.StartupActivity");
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void FirstScreen(){
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        FirstScreen page = new FirstScreen(driver);
        page.Next();
        page.Next();
        page.Next();
        page.Skip();
    }

}