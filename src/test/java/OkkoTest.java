import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OkkoTest {
    private AppiumDriver<AndroidElement> driver;

    @BeforeTest
    public  void setUp() throws Exception {
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

    @AfterTest
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
    @Test
    public void SwitchToPreProd(){
        MainScreen page1 = new MainScreen(driver);
        page1.ActionBarLongPress();
        page1.SwithToPreProd();
    }

}