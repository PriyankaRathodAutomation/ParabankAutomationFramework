package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {


	    WebDriver driver;

	    public AccountPage(WebDriver driver) {

	        this.driver = driver;
	    }

	    By openNewAccountLink =
	    By.linkText("Open New Account");

	    By openAccountBtn =
	    By.xpath("//input[@value='Open New Account']");

	    public void openNewAccount() {

	        driver.findElement(openNewAccountLink)
	        .click();

	        driver.findElement(openAccountBtn)
	        .click();
	    }
	}

