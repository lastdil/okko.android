import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by idrygin on 15.06.2016.
 */
public class BagPage extends BasePage {

    @AndroidFindBy(xpath =("//android.widget.TextView[@text='Загрузки']"))
    private WebElement Downloads;
    @AndroidFindBy(xpath =("//android.widget.TextView[@text='Запомненные']"))
    private WebElement Saved;
    @AndroidFindBy(xpath =("//android.widget.TextView[@text='Мои покупки']"))
    private WebElement Purchased;
    @AndroidFindBy(xpath =("//android.widget.TextView[@text='История просмотров']"))
    private WebElement History;
    @AndroidFindBy(className = "android.widget.ImageButton")
    private WebElement Back;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Начало']"))
    private WebElement Film;


    public BagPage (AppiumDriver driver){
        super(driver);
    }
    public void OpenDownloads(){
        Downloads.click();
    }
    public void OpenSaved(){
        Saved.click();
    }
    public void OpenPurchased(){
        Purchased.click();
    }
    public void OpenHistory(){
        History.click();
    }
    public void ClickBack(){
        Back.click();
    }
    public void OpenFilm(){
        Film.click();
    }
}
