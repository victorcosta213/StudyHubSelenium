package tests;

import com.pages.LoginPage;
import com.pages.utils.DriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import static org.junit.Assert.assertTrue;

public class LoginTests {
    private static WebDriver driver;
    private static LoginPage loginPage;

    @BeforeClass
    public static void setup() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
        driver.get("https://sth-front-dev.vercel.app/login");
    }

    @AfterClass
    public static void tearDown() {
        DriverFactory.quitDriver();
    }

    @Test
    public void testCT001_LoginSuccessful() {
        loginPage.login("usuario@exemplo.com", "senha123");
        assertTrue("Login falhou!", loginPage.isLoginSuccessful());
    }

    @Test
    public void testCT002_LoginUnsuccessful() {
        loginPage.login("email@naocadastrado.com", "senhaerrada");
        assertTrue("Usuário não deveria acessar!", !loginPage.isLoginSuccessful());
    }
}

