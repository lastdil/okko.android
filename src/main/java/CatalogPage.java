import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by idrygin on 15.06.2016.
 */
public class CatalogPage extends BasePage {

    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Жанры']"))
    private WebElement Genres;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Лучшее']"))
    private WebElement Best;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Новинки']"))
    private WebElement New;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Последние поступления']"))
    private WebElement RecentlyAdded;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Блокбастеры']"))
    private WebElement Blokbasters;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Лучшее для детей']"))
    private WebElement BestForChildren;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Брутальное кино']"))
    private WebElement BrutalFilms;
    @AndroidFindBy(className = "android.widget.ImageButton")
    private WebElement Back;

    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Начало']"))
    private WebElement Film;




    public CatalogPage(AppiumDriver driver) {
        super(driver);
    }
    public void OpenGenres(){
        Genres.click();
    }public void OpenBest(){
        Best.click();
    }
    public void OpenNew(){
        New.click();
    }
    public void OpenRecentlyAdded(){
        RecentlyAdded.click();
    }
    public void OpenBlokbacters(){
        Blokbasters.click();
    }
    public void OpenBestForChildrens(){
        BestForChildren.click();
    }
    public void OpenBrutalFilms(){
        BrutalFilms.click();
    }
    public void Back(){
        Back.click();
    }
    public void OpenFilm(){
        Film.click();
    }
}
