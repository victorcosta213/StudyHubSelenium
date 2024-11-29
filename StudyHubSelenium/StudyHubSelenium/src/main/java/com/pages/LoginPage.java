package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.id(":r0:"); // Campo de email
    private By passwordField = By.id(":r1:"); // Atualizar conforme necessário
    private By loginButton = By.xpath("//button[text()='Entrar']"); // Usando texto do botão

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isLoginSuccessful() {
        return driver.getCurrentUrl().contains("dashboard"); // Ajuste conforme a URL de sucesso
    }
}