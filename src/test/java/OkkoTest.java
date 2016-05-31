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
    AppiumDriver<WebElement> driver;

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
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void FirstScreen () throws Exception {
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        FirstScreen page = new FirstScreen(driver);
        page.Next();
        page.Next();
        page.Next();
        page.Skip();
    }
    @Test (priority = 2)
    public void SwitchToPreProd() throws Exception{
        MainScreen page = new MainScreen(driver);
        page.SwithToPreProd();
    }
    @Test (priority = 3)
        public void Search() throws Exception {
        MainScreen page = new MainScreen(driver);
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
        page.SearchClick();
       // driver.findElement(By.id("ru.more.play:id/search_edit")).sendKeys("bla-bla");
        page.SearchEdit("Марсианин");
      //  driver.findElement(By.id("ru.more.play:id/search_edit")).submit();
        //page.SearchEdit();
    }
}