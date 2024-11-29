package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CommunityPage {
    private WebDriver driver;

    public CommunityPage(WebDriver driver) {
        this.driver = driver;
    }

    // Seletores
    private By communityIcon = By.xpath("//a[@href='/student/comunidade-aluno']");
    private By addDiscussionButton = By.xpath("//button[contains(@class, 'MuiFab-primary')]");
    private By discussionTitleField = By.xpath("//input[@placeholder='Título da discussão']");
    private By discussionContentField = By.xpath("//textarea[@placeholder='Descrição da discussão']");
    private By saveDiscussionButton = By.xpath("//button[contains(text(), 'Salvar')]");
    private By discussionOptions = By.xpath("//button[contains(@aria-haspopup, 'true')]");
    private By deleteOption = By.xpath("//li[contains(text(), 'Excluir')]");

    // Métodos

    public void openCommunityPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("MuiBackdrop-root")));
        driver.findElement(communityIcon).click();
    }

    public void clickAddDiscussionButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addDiscussionButton)).click();
    }

    public void createDiscussion(String title, String content) {
        clickAddDiscussionButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'MuiDialog-root')]")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(discussionTitleField)).sendKeys(title);
        driver.findElement(discussionContentField).sendKeys(content);
        wait.until(ExpectedConditions.elementToBeClickable(saveDiscussionButton)).click();
    }

    public void deleteDiscussion(String title) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By discussionLocator = By.xpath("//h6[text()='" + title + "']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(discussionLocator));

        driver.findElement(discussionOptions).click();
        wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
    }
}

