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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.*;

public class ArtigosTest {
  private WebDriver driver;
  private JavascriptExecutor js;

  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void artigos() throws InterruptedException {
    driver.get("https://sth-front-dev.vercel.app/student");
    driver.manage().window().setSize(new Dimension(1382, 736));

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    
    WebElement menuItem = driver.findElement(By.cssSelector(".MuiListItem-root:nth-child(3) > .MuiTypography-root"));
    menuItem.click();
    Thread.sleep(1000); 

    WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1:")));

 
    clearAndType(input, "clovis");
    Thread.sleep(1000);
    clearAndType(input, "css");
    Thread.sleep(1000);
    clearAndType(input, "react");
    Thread.sleep(1000);
    clearAndType(input, "anna");
    Thread.sleep(1000);

    
    simulateDropdownInteraction(wait);

   
  }

  private void clearAndType(WebElement element, String text) throws InterruptedException {
    element.click();
    element.sendKeys(Keys.CONTROL, "a");
    element.sendKeys(Keys.DELETE);      
    Thread.sleep(500);                 
    element.sendKeys(text);             
    Thread.sleep(500);                 
  }

  private void simulateDropdownInteraction(WebDriverWait wait) throws InterruptedException {
    WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".MuiSelect-select")));
    dropdown.click();
    Thread.sleep(1000); 

    WebElement backdrop = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".MuiBackdrop-root")));
    backdrop.click();
    Thread.sleep(1000); 
  }
}
