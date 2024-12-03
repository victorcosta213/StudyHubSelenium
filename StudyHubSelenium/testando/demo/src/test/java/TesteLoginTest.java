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
    private WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1382, 736));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testeLoginComInformacoesValidas() {
        driver.get("https://sth-front-dev.vercel.app/login");

       
        WebElement campoEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r0:")));
        campoEmail.clear();
        campoEmail.sendKeys("gustavo1@gmail.com");

        
        WebElement campoSenha = driver.findElement(By.id(":r1:"));
        campoSenha.clear();
        campoSenha.sendKeys("gustavo");

        
        WebElement botaoLogin = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.MuiButton-root.MuiButton-containedPrimary[type='button']")));
        botaoLogin.click();

    }

    @Test
    public void testeLoginComInformacoesInvalidas() {
        driver.get("https://sth-front-dev.vercel.app/login");

    
        WebElement campoEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r0:")));
        campoEmail.clear();
        campoEmail.sendKeys("usuario@invalido.com");

        
        WebElement campoSenha = driver.findElement(By.id(":r1:"));
        campoSenha.clear();
        campoSenha.sendKeys("senha_incorreta");

        
        WebElement botaoLogin = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.MuiButton-root.MuiButton-containedPrimary[type='button']")));
        botaoLogin.click();

        
    }
}