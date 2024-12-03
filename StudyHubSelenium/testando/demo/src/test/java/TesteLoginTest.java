import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class TesteLoginTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1382, 736));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testeLoginComInformacoesValidas() {
        driver.get("https://sth-front-dev.vercel.app/login");

       
        driver.findElement(By.id(":r0:")).sendKeys("victor@test.com");
        driver.findElement(By.id(":r1:")).sendKeys("1234567");

        
        driver.findElement(By.cssSelector(".MuiButton-root")).click();

        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.urlContains("https://sth-front-dev.vercel.app"));

       
        String urlAtual = driver.getCurrentUrl();
        assertTrue("Erro: não foi redirecionado para a página principal.", urlAtual.contains("https://sth-front-dev.vercel.app"));
    }

    @Test
    public void testeLoginComInformacoesInvalidas() {
        driver.get("https://sth-front-dev.vercel.app/login");

       
        driver.findElement(By.id(":r0:")).sendKeys("usuario@invalido.com");
        driver.findElement(By.id(":r1:")).sendKeys("senha_incorreta");

       
        driver.findElement(By.cssSelector(".MuiButton-root")).click();

        /*// Verificar mensagem de erro na tela
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement mensagemErro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mensagem-erro")));

       
        assertNotNull("Erro: mensagem de erro não encontrada.", mensagemErro);
        assertEquals("Usuário ou senha inválidos", mensagemErro.getText());*/
    }
}
