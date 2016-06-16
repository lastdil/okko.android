import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.tools.ant.taskdefs.condition.Os;
import org.openqa.selenium.WebElement;

/**
 * Created by idrygin on 15.06.2016.
 */
public class CatalogPage extends BasePage {

    //Categories

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
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Скоро']"))
    private WebElement SoonFilms;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Русское кино']"))
    private WebElement RussiaFilms;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Сериалы']"))
    private WebElement Serials;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='SALE -50%']"))
    private WebElement SaleFilms;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Топ-250 КиноПоиск']"))
    private WebElement Top250;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Лауреаты премии Оскар']"))
    private WebElement OskarFilms;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Кино в дорогу']"))
    private WebElement RoadFilms;

    //Genres

    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Мультфильмы']"))
    private WebElement Cartoon;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Фантастика']"))
    private WebElement Fantasy;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Комедии']"))
    private WebElement Comedy;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Боевики']"))
    private WebElement Fights;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Драмы']"))
    private WebElement Drama;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Триллеры']"))
    private WebElement Thriller;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Ужасы']"))
    private WebElement Horror;
    @AndroidFindBy (xpath =("//android.widget.TextView[@text='Приключения']"))
    private WebElement Adventures;
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
    public void OpenSoon(){
        SoonFilms.click();
    }
    public void OpenRussian(){
        RussiaFilms.click();
    }
    public void OpenSerials(){
        Serials.click();
    }
    public void OpenSale(){
        SaleFilms.click();
    }
    public void OpenTop250(){
        Top250.click();
    }
    public void OpenOskar(){
        OskarFilms.click();
    }
    public void OpenRoad(){
        RoadFilms.click();
    }
    public void Back(){
        Back.click();
    }
    public void OpenFilm(){
        Film.click();
    }
    public void OpenCartoons(){
        Cartoon.click();
    }
    public void OpenFantasy(){
        Fantasy.click();
    }
    public void OpenComedy(){
        Comedy.click();
    }
}
