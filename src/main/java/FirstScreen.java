import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by idrygin on 27.05.2016.
 */
public class FirstScreen {

    private AppiumDriver<AndroidElement> driver;
    //Locators
    @FindBy(id = "ru.more.play:id/next")
    WebElement Next;

    @FindBy(id = "ru.more.play:id/skip")
    WebElement Skip;




    //Constructor

    public FirstScreen(AppiumDriver<AndroidElement> driver) {
        this.driver = driver;

        // Init

        PageFactory.initElements(driver, this);
    }

    public void Next() {
        Next.click();

    }

    public void Skip(){
        Skip.click();
    }
}
