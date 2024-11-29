package tests;
import com.pages.ArticlesPage;
import com.pages.utils.DriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import static org.junit.Assert.assertTrue;

public class ArticlesTests {
    private static WebDriver driver;
    private static ArticlesPage articlesPage;

    @BeforeClass
    public static void setup() {
        driver = DriverFactory.getDriver();
        articlesPage = new ArticlesPage(driver);
        driver.get("https://sth-front-dev.vercel.app/articles");
    }

    @AfterClass
    public static void tearDown() {
        DriverFactory.quitDriver();
    }

    @Test
    public void testCT004_SearchValidArticle() {
        articlesPage.searchArticle("tecnologia");
        assertTrue("Artigo não encontrado!", articlesPage.isArticleDisplayed("tecnologia"));
    }

    @Test
    public void testCT006_SearchInvalidArticle() {
        articlesPage.searchArticle("temaInvalido");
        assertTrue("Artigo inválido não tratado corretamente!", !articlesPage.isArticleDisplayed("temaInvalido"));
    }
}
