import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

public class TesteLoginTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); 
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testeLogin() {
        driver.get("https://sth-front-dev.vercel.app/login");
        driver.manage().window().setSize(new Dimension(1382, 736));
        
        driver.findElement(By.id(":r0:")).sendKeys("victor@test.com");
        
        
        WebElement element = driver.findElement(By.cssSelector(".MuiButton-root"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();

      
        driver.findElement(By.id(":r1:")).sendKeys("1234567");

        driver.findElement(By.cssSelector(".MuiButton-root")).click();
    }
}
