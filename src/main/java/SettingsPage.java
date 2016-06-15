import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by idrygin on 15.06.2016.
 */
public class SettingsPage extends BasePage {

    @AndroidFindBy(className = "android.widget.ImageButton")
    private WebElement Back;


    public SettingsPage(AppiumDriver driver){
        super(driver);
}
    public void ClickBack(){
        Back.click();
    }
}
