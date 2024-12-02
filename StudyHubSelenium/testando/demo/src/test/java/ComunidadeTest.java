import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ComunidadeTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void comunidade() {
    driver.get("https://sth-front-dev.vercel.app/student");
    driver.manage().window().setSize(new Dimension(1382, 736));
    driver.findElement(By.cssSelector(".MuiListItem-root:nth-child(2) > .MuiTypography-root")).click();
    driver.findElement(By.cssSelector(".MuiFab-root")).click();
    driver.findElement(By.id(":r1:")).click();
    driver.findElement(By.id(":r1:")).sendKeys("testando");
    driver.findElement(By.id(":r2:")).click();
    driver.findElement(By.id(":r2:")).sendKeys("testando");
    driver.findElement(By.id(":r3:")).click();
    driver.findElement(By.id(":r3:")).sendKeys("teste");
    driver.findElement(By.id(":r4:")).click();
    driver.findElement(By.id(":r4:")).sendKeys("testes");
    driver.findElement(By.cssSelector(".MuiButton-root")).click();
    driver.findElement(By.cssSelector(".MuiPaper-root:nth-child(1) > .MuiCardContent-root > .MuiBox-root > .MuiButtonBase-root > .MuiSvgIcon-root")).click();
    driver.findElement(By.cssSelector(".MuiMenuItem-root:nth-child(2)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiPaper-root:nth-child(1) > .MuiCardContent-root > .MuiBox-root > .MuiButtonBase-root > .MuiSvgIcon-root"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".MuiPaper-root:nth-child(1) > .MuiCardContent-root > .MuiBox-root > .MuiButtonBase-root > .MuiSvgIcon-root")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".MuiMenuItem-root:nth-child(1)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiButton-outlined"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id(":r5:")).click();
    driver.findElement(By.id(":r5:")).sendKeys("Primeiros  Docker");
    driver.findElement(By.id(":r6:")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiButton-containedSuccess"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id(":r6:")).sendKeys("Lorem dolor sit amet consectetur. Facilisis sem tortor in quam nec.");
    driver.findElement(By.cssSelector(".MuiButton-containedSuccess")).click();
  }
}
