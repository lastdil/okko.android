import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static android.R.attr.value;

/**
 * Created by idrygin on 27.05.2016.
 */
public class MainScreen extends BasePage{
    //Locators
    @AndroidFindBy(id = "ru.more.play:id/toolbar_actionbar")
    private WebElement Actionbar;
    @AndroidFindBy(xpath = (".//*[@text='SIST (PREPROD)']"))
    private WebElement PreProd;
    @AndroidFindBy(id = "ru.more.play:id/menu_search")
    private WebElement Search;
    @AndroidFindBy(id = "ru.more.play:id/search_edit")
    private WebElement SearchEdit;
    @AndroidFindBy (id = "ru.more.play:id/toolbar_menu_settings")
    private WebElement SettingsButton;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Мои фильмы']"))
            private WebElement Bag;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Каталог']"))
    private WebElement Catalog;
    public MainScreen(AppiumDriver driver) {
        super(driver);

    }



        public void SwitchToPreProd(){
            TouchAction longPress = new TouchAction(driver);

            longPress.longPress(
                   driver.findElementById("ru.more.play:id/toolbar_actionbar")).perform();
            PreProd.click();
        }
        public void SearchClick(){
            Search.click();

        }
        public void SearchField(String search){
            //Search.click();

            SearchEdit.sendKeys(search);

            //driver.getKeyboard();

            //((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.KEYCODE_SEARCH);

        }
        public void OpenSetting(){

            //SettingsButton.click();
            driver.findElementById("ru.more.play:id/toolbar_menu_settings").click();
        }
        public void OpenBag(){
            Bag.click();
        }
        public void OpenCatalog(){
            Catalog.click();
        }
}
