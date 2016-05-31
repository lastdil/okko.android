import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by idrygin on 27.05.2016.
 */
 public class FirstScreen extends BasePage{



    //Locators
    @AndroidFindBy(id = "ru.more.play:id/next")
    private MobileElement Next;

    @AndroidFindBy(id = "ru.more.play:id/skip")
    private MobileElement Skip;

    public FirstScreen(AppiumDriver driver) {
        super(driver);
    }



    public void Next() {
        Next.click();

    }

    public void Skip(){

        Skip.click();
    }
}
