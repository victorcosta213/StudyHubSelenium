package tests;

import com.pages.CommunityPage;
import com.pages.utils.DriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static org.junit.Assert.assertTrue;

public class CommunityTests {
    private static WebDriver driver;
    private static CommunityPage communityPage;

    @BeforeClass
    public static void setup() {
        driver = DriverFactory.getDriver();
        communityPage = new CommunityPage(driver);
        driver.get("https://sth-front-dev.vercel.app/student/comunidade-aluno");
    }

    @AfterClass
    public static void tearDown() {
        DriverFactory.quitDriver();
    }

    @Test
    public void testCT010_OpenCommunityPage() {
        communityPage.openCommunityPage();
        assertTrue("Não foi possível abrir a página de Comunidade!",
                driver.getCurrentUrl().contains("comunidade-aluno"));
    }

    @Test
    public void testCT011_CreateDiscussion() {
        communityPage.openCommunityPage();
        communityPage.createDiscussion("Título da Discussão", "Conteúdo da discussão");
        assertTrue("A discussão não foi criada corretamente!",
                driver.findElements(By.xpath("//h6[text()='Título da Discussão']")).size() > 0);
    }

    @Test
    public void testCT014_DeleteDiscussion() {
        communityPage.openCommunityPage();
        communityPage.deleteDiscussion("Título da Discussão");
        assertTrue("A discussão não foi excluída corretamente!",
                driver.findElements(By.xpath("//h6[text()='Título da Discussão']")).isEmpty());
    }
}