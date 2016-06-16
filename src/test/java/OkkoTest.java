import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class OkkoTest {
    AppiumDriver<WebElement> driver;

    @BeforeTest
    public void setUp() throws Exception {
        // set up appium
        File appDir = new File("C:\\Users\\idrygin\\IdeaProjects\\okko.android\\apps");
        File app = new File(appDir, "mobile-googlePlayWidevineAppDrm-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformVersion", "6");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "ru.more.play");
        capabilities.setCapability("appActivity", "ru.more.play.ui.StartupActivity");
        //capabilities.setCapability("unicodeKeyboard", "True");
        //capabilities.setCapability("resetKeyboard", "True");
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void FirstScreen() throws Exception {
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        FirstScreen firstScreen = new FirstScreen(driver);
        firstScreen.Next();
        firstScreen.Next();
        firstScreen.Next();
        firstScreen.Skip();
    }


    /*@Test(priority = 2)
    public void SwitchToPreProd() throws Exception {
        MainScreen page = new MainScreen(driver);
        page.SwitchToPreProd();
    }*/

    @Test(priority = 3)
    public void OpenSettings() throws Exception {
        MainScreen mainScreen = new MainScreen(driver);
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
        //page1.OpenSetting();
        mainScreen.OpenBag();
        /*
        driver.findElement(By.id("ru.more.play:id/search_edit")).sendKeys("bla-bla");
        page1.SearchClick();
        page1.SearchField("sdfsdf"  );
        driver.getKeyboard();
        ((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.KEYCODE_SEARCH);
          driver.findElement(By.id("ru.more.play:id/search_edit")).submit();
        page.SearchEdit();
        } */


    }

    @Test(priority = 4)
    public void BagPage() throws Exception {
        BagPage bagPage = new BagPage(driver);
        bagPage.OpenDownloads();
        bagPage.OpenHistory();
        bagPage.OpenPurchased();
        bagPage.OpenSaved();
        bagPage.OpenDownloads();
        bagPage.ClickBack();
    }

    @Test(priority = 5)
    public void OpenSettings1() throws Exception {
        MainScreen page1 = new MainScreen(driver);
        page1.OpenSetting();
    }

    @Test(priority = 6)
    public void Settings() throws Exception {
        SettingsPage page1 = new SettingsPage(driver);
        page1.ClickBack();
    }

    @Test(priority = 7)
    public void OpenCatalog() throws Exception {
        MainScreen mainScreen = new MainScreen(driver);
        CatalogPage catalogPage = new CatalogPage(driver);
        mainScreen.OpenCatalog();
        catalogPage.OpenNew();
        catalogPage.OpenBest();
        catalogPage.OpenRecentlyAdded();
        catalogPage.OpenBlokbacters();
        catalogPage.OpenBestForChildrens();
        catalogPage.OpenBrutalFilms();
        catalogPage.OpenSoon();
        catalogPage.OpenRussian();
        catalogPage.OpenSerials();
        catalogPage.OpenSale();
        catalogPage.OpenTop250();
        catalogPage.OpenOskar();
        catalogPage.OpenRoad();
        catalogPage.Back();
        mainScreen.OpenCatalog();
        catalogPage.OpenGenres();
        catalogPage.OpenCartoons();
        catalogPage.Back();
        catalogPage.OpenFantasy();
        catalogPage.Back();
        catalogPage.OpenComedy();
        catalogPage.Back();
        catalogPage.Back();


    }
    @Test(priority = 8)
    public void SaveFilmToBagAndRemove(){
        MainScreen mainScreen = new MainScreen(driver);
        CatalogPage catalogPage = new CatalogPage(driver);
        MovieCard movieCard = new MovieCard(driver);
        BagPage bagPage = new BagPage(driver);
        mainScreen.OpenCatalog();
        catalogPage.OpenFilm();
        movieCard.BagButtonClick();
        movieCard.Back();
        catalogPage.Back();
        mainScreen.OpenBag();
        bagPage.OpenSaved();
        bagPage.OpenFilm();
        movieCard.BagButtonClick();
        bagPage.ClickBack();
        bagPage.ClickBack();
    }
}