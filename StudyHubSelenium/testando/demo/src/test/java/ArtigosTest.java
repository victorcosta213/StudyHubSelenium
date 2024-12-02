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
public class ArtigosTest {
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
  public void artigos() {
    driver.get("https://sth-front-dev.vercel.app/student");
    driver.manage().window().setSize(new Dimension(1382, 736));
    driver.findElement(By.cssSelector(".MuiListItem-root:nth-child(3) > .MuiTypography-root")).click();
    driver.findElement(By.id(":r1:")).click();
    driver.findElement(By.id(":r1:")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiSelect-select"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiBackdrop-root"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(2)")).click();
    driver.findElement(By.id(":r1:")).click();
    driver.findElement(By.id(":r1:")).sendKeys("clovis");
    driver.findElement(By.id(":r1:")).click();
    driver.findElement(By.id(":r1:")).click();
    {
      WebElement element = driver.findElement(By.id(":r1:"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id(":r1:")).sendKeys("clovis");
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiSelect-select"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiBackdrop-root"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(1)")).click();
    driver.findElement(By.id(":r1:")).click();
    driver.findElement(By.id(":r1:")).sendKeys("css");
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiSelect-select"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiBackdrop-root"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.cssSelector(".MuiBackdrop-root")).click();
    driver.findElement(By.id(":r1:")).click();
    {
      WebElement element = driver.findElement(By.id(":r1:"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id(":r1:")).click();
    driver.findElement(By.id(":r1:")).sendKeys("react");
    driver.findElement(By.id(":r1:")).sendKeys("react");
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiSelect-select"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiBackdrop-root"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(2)")).click();
    driver.findElement(By.id(":r1:")).click();
    driver.findElement(By.id(":r1:")).sendKeys("anna");
    driver.findElement(By.id(":r1:")).sendKeys("anna");
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiSelect-select"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiBackdrop-root"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(1)")).click();
  
  }
}
