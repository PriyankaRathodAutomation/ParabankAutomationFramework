package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPayPage {

    WebDriver driver;

    public BillPayPage(WebDriver driver) {

        this.driver = driver;
    }

    By billPayLink =
    By.linkText("Bill Pay");

    By payeeName =
    By.name("payee.name");

    By address =
    By.name("payee.address.street");

    By city =
    By.name("payee.address.city");

    By state =
    By.name("payee.address.state");

    By zipCode =
    By.name("payee.address.zipCode");

    By phone =
    By.name("payee.phoneNumber");

    By account =
    By.name("payee.accountNumber");

    By verifyAccount =
    By.name("verifyAccount");

    By amount =
    By.name("amount");

    By sendPaymentBtn =
    By.xpath("//input[@value='Send Payment']");

    public void billPayment() {

        driver.findElement(billPayLink)
        .click();

        driver.findElement(payeeName)
        .sendKeys("Test User");

        driver.findElement(address)
        .sendKeys("ABC Road");

        driver.findElement(city)
        .sendKeys("Pune");

        driver.findElement(state)
        .sendKeys("MH");

        driver.findElement(zipCode)
        .sendKeys("411001");

        driver.findElement(phone)
        .sendKeys("9876543210");

        driver.findElement(account)
        .sendKeys("12345");

        driver.findElement(verifyAccount)
        .sendKeys("12345");

        driver.findElement(amount)
        .sendKeys("1000");

        driver.findElement(sendPaymentBtn)
        .click();
    }
}
