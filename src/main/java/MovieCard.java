import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by idrygin on 15.06.2016.
 */
public class MovieCard extends BasePage {


    @AndroidFindBy(id = "ru.more.play:id/bag_button")
    private WebElement BagButton;
    @AndroidFindBy(className = "android.widget.ImageButton")
    private WebElement Back;

    public MovieCard(AppiumDriver driver) {
        super(driver);
    }

    public void BagButtonClick(){
        BagButton.click();
    }
    public void Back(){
        Back.click();
    }
}
