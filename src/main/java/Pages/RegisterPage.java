package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
    }

    By registerLink =
    By.linkText("Register");

    By firstName =
    By.id("customer.firstName");

    By lastName =
    By.id("customer.lastName");

    By username =
    By.id("customer.username");

    By password =
    By.id("customer.password");

    By confirmPassword =
    By.id("repeatedPassword");

    By registerBtn =
    By.xpath("//input[@value='Register']");

    public void registerUser() {

        driver.findElement(registerLink).click();

        driver.findElement(firstName)
        .sendKeys("Test");

        driver.findElement(lastName)
        .sendKeys("User");

        driver.findElement(username)
        .sendKeys("test123");

        driver.findElement(password)
        .sendKeys("pass123");

        driver.findElement(confirmPassword)
        .sendKeys("pass123");

        driver.findElement(registerBtn).click();
    }
}
