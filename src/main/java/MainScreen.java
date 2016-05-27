import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by idrygin on 27.05.2016.
 */
public class MainScreen {
    private AppiumDriver<AndroidElement> driver;
    //Locators
    @FindBy(id = "ru.more.play:id/toolbar_actionbar")
    WebElement Actionbar;
    @FindBy(xpath = (".//*[@text='SIST (PREPROD)']"))
    WebElement PreProd;

    //Constructor

    public MainScreen(AppiumDriver<AndroidElement> driver) {
        this.driver = driver;

        // Init

        PageFactory.initElements(driver, this);
    }
        public void ActionBarLongPress(){
            TouchAction longPress = new TouchAction(driver);

            longPress.longPress(
                    driver.findElementById("ru.more.play:id/toolbar_actionbar")).perform();
        }
        public void SwithToPreProd(){
            PreProd.click();
        }

}
