package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferPage {

    WebDriver driver;

    public TransferPage(WebDriver driver) {

        this.driver = driver;
    }

    By transferFundsLink =
    By.linkText("Transfer Funds");

    By amount =
    By.id("amount");

    By transferBtn =
    By.xpath("//input[@value='Transfer']");

    public void transferFunds() {

        driver.findElement(transferFundsLink)
        .click();

        driver.findElement(amount)
        .sendKeys("500");

        driver.findElement(transferBtn)
        .click();
    }
}
