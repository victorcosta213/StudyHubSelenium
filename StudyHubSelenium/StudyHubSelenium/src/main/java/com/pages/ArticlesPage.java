package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArticlesPage {
    private WebDriver driver;

    public ArticlesPage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchField = By.id("search"); // Ajuste conforme o HTML
    private By resultsList = By.cssSelector(".article-list");

    public void searchArticle(String keyword) {
        driver.findElement(searchField).sendKeys(keyword);
        driver.findElement(searchField).submit();
    }

    public boolean isArticleDisplayed(String keyword) {
        return driver.findElement(resultsList).getText().contains(keyword);
    }
}
